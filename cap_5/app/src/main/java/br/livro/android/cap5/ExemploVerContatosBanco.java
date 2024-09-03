package br.livro.android.cap5;

import android.app.Activity;
import android.content.Intent;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ExemploVerContatosBanco extends Activity implements View.OnClickListener {
    //Constante para identificar a sub-activity lançada.
    private static final int SELECIONAR_CONTATO = 1;
    private static final String CATEGORIA = "livro";

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout_vercontatosbanco);

        Button button = (Button) findViewById(R.id.botaovertodoscontatos);
        button.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        //Representa o endereço que queremos abrir:
        Uri uri = Uri.parse("content://com.android.contacts/contacts/");

        //Cria a Intent com o endereço:
        Intent it = new Intent(Intent.ACTION_PICK, uri);

        //Envia a mensagem ao sistema operacional:
        startActivityForResult(it, SELECIONAR_CONTATO);
    }

    @Override
    protected void onActivityResult(int codigo, int resultado, Intent it) {

        //URI para visualizaro contato selecionado:
        Uri uri = it.getData();

        //Busca o conato no banco de dados utilizando a Uri do contato selecionado:
        // Obter o ContentResolver
        ContentResolver contentResolver = getContentResolver();
        // Fazer a consulta usando o ContentResolver
        Cursor c = contentResolver.query(uri, null, null, null, null);


        //Posiciona o cursor
        c.moveToNext();

        //Recupera o nome do contato:
        int nameColumn = c.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME);
        String nome = c.getString(nameColumn);
        Toast.makeText(this, "Nome: " + nome, Toast.LENGTH_SHORT).show();

    }
}