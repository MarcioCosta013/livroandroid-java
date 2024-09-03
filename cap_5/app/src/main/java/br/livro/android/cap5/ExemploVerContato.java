package br.livro.android.cap5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExemploVerContato extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout_vercontato);

        final Button button = (Button) findViewById(R.id.buttonvercontato);
        button.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        //Representa o endereço que queremos abrir:
        Uri uri = Uri.parse("content://com.android.contacts/contacts/0");

        //Cria a Intent com o endereço:
        Intent it = new Intent(Intent.ACTION_VIEW, uri);

        //Envia a mensagem ao sistema operacional:
        startActivity(it);
    }
}