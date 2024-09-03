package br.livro.android.cap5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExemploAbrirBrowser extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.form_browser);

        final Button button = (Button) findViewById(R.id.botaoOk);
        button.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        EditText campoEndereco = (EditText) findViewById(R.id.campoEndereco);
        String endereco = campoEndereco.getText().toString();

        //Representa o endereço que queremos abrir:
        Uri uri = Uri.parse(endereco);

        //Cria a Intent com o endereço:
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        //Envia a mensagem ao sistema operacional:
        startActivity(intent);
    }
}