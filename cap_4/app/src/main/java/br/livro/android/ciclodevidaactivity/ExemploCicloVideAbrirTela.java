package br.livro.android.ciclodevidaactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExemploCicloVideAbrirTela extends ExemploCicloVida implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        Button b = new Button(this);
        b.setText("Click aqui para abrir a tela.");
        b.setOnClickListener(this);
        setContentView(b);
    }

    /* - Chama a outra tela sem passar parametro.
    public  void onClick(View v){
        Intent it = new Intent(this,Tela2.class);
        startActivity(it);
    }
     */

    /*
    @Override - Chama a outra tela passando parametro.
    public void onClick(View v) {
        Intent it = new Intent(this,Tela2.class);
        Bundle params = new Bundle();
        params.putString("msg", "Olá");
        it.putExtras(params);
        startActivity(it);
    }
     */

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this,Tela2.class);
        it.putExtra("msg", "Olá!");
        startActivity(it);
    }
}