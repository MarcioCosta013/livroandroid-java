package br.livro.android.cap3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exemplo4 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //Abre a tela .xml
        setContentView(R.layout.activity_exemplo4_listener);

        //Busca o TextView pelo id
        final EditText editText = (EditText) findViewById(R.id.campoNome);
        final TextView txtResultado = (TextView) findViewById(R.id.campoResultado);

        Button button = (Button) findViewById(R.id.botaoOk);

        //informa o listener
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nome = editText.getText().toString();
                //Atuaiza p texto
                txtResultado.setText("Obrigado " + nome);
            }
        });

    }
}