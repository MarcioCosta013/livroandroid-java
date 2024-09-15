package br.livro.android.cap8;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //chamada pela category default do android com action "ACAO_TESTE"
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String msg = extras.getString("mensagem");
            TextView text = new TextView(this);
            text.setText("Está é a Activity1\nMensagem: "+ msg);
            setContentView(text);
        } else {
            TextView text = new TextView(this);
            text.setText("Está é a ACtivity 1");
            setContentView(text);
        }
    }
}