package br.livro.android.cap5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExemploVerTodosContatos extends Activity implements View.OnClickListener {
    //Constante para identificar a sub-activity lançada.
    private static final int SELECIONAR_CONTATO = 1;
    private static final String CATEGORIA = "livro";

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout_vertodoscontatos);

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
        if (it == null){
            Toast.makeText(this,"Nenhum contato.", Toast.LENGTH_SHORT).show();
        }

        //URI para visualizaro contato selecionado
        Uri uri = it.getData();
        //Toast.makeText(this, "Contato: " + uri,Toast.LENGTH_SHORT).show();

        //Solicita o Android para visualizar o contato:
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}