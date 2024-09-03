package br.livro.android.ciclodevidaactivity;

import android.app.ListActivity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExemploListaContatos2 extends ListActivity {

    private ListAdapter adaptador;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        //Para customizar o ListView com outro Layout se necessário.
        //setContetView(R.layout_listview_contatos);

        //Uri para buscar od contatos:
        Uri uri = ContactsContract.Contacts.CONTENT_URI;

        //Recupera o cursor dos contatos:
        Cursor c = getContentResolver().query(uri, null, null, null, null);
        startManagingCursor(c);

        //Lista o nome do contato:
        String[] colunas = new String[]{ ContactsContract.Contacts.DISPLAY_NAME};
        int[] campos = new int[]{R.id.nome};

        //Informe o adapter para ligar os valores ao XML da View
        adaptador = new SimpleCursorAdapter(this, R.layout.layout_contatos, c, colunas,campos);

        setListAdapter(adaptador);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //Recupera o cursor na posiçõ selecionada:
        Cursor c = (Cursor) adaptador.getItem(position);

        //Recupera o nome e Telefone:
        String nomeColuna = ContactsContract.Contacts.DISPLAY_NAME;
        String nome = c.getString(c.getColumnIndexOrThrow(nomeColuna));
        Toast.makeText(this, "Contato selecionado: " + nome, Toast.LENGTH_SHORT).show();
    }
}