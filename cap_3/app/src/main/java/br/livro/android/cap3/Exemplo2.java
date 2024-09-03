package br.livro.android.cap3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Exemplo2 extends Activity {

   /* Exemplo de construção da tela pelo XML.
    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.exemplo2);
    } */

    //Exemplo da construção da tela com a API Java.
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //Cria o TExtView para exibir na tela.
        TextView view = new TextView(this);
        view.setText("Exemplo de texto no Android");
        setContentView(view);
    }
}
