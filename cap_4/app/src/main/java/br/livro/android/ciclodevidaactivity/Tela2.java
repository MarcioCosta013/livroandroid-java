package br.livro.android.ciclodevidaactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela2 extends ExemploCicloVida {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        TextView view = new TextView(this);
        view.setText("Esta é a tela 2");
        setContentView(view);

        /* - como receber parametro completo.
        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if (params != null){
                String msg = params.getString("msg");
                Log.i(CATEGORIA, "Messagem: " + msg);
            }
        }
         */
        Intent it = getIntent(); //Modo abreviado de se receber um parametro.
            if (it != null){
                String msg = it.getStringExtra("msg");
                if (msg != null){
                    Log.i(CATEGORIA, "Mensagem: " + msg);
                }
            }
    }
}