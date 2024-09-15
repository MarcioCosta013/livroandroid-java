package br.livro.android.cap8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Botao extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("Teste");
        button.setOnClickListener(this);
        setContentView(button);
    }


    @Override
    public void onClick(View v) {
        /* //Exemplo 1
        Intent it = new Intent("ACAO_TESTE");
        it.putExtra("mesagem", "Mensagem de teste");
        startActivity(it);*/

        //Exmplo 2
        Intent it = new Intent("ACAO_TESTE");
        //it.addCategory("CATEGORIA_TESTE"); sem essa linha o sistema pergunta qual activity o usuário quer abrir.
        it.putExtra("mesagem", "Mensagem de teste do IntentFilter 2...");
        startActivity(it);

    }
}
