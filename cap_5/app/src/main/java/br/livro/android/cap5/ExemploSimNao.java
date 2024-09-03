package br.livro.android.cap5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExemploSimNao extends Activity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.tela_sim_nao);

        //Sim
        Button sim = (Button) findViewById(R.id.btnsim);
        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cria Intent
                Intent it = new Intent();

                //Seta a mensagem de retorno
                it.putExtra("msg","Clicou sim !");

                //Seta o status do resultado e a Intent
                setResult(1,it);
                //Fim dessa activity
                finish();
            }
        });

        //Não
        Button nao = (Button) findViewById(R.id.btnnao);
        nao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cria a Intent
                Intent it = new Intent();

                //Seta a mengessagem de retorno
                it.putExtra("msg", "Clicou em Não!");

                //Seta o status do resultado e a Intent
                setResult(2,it);

                finish();
            }
        });
    }

    /**
     * onde vai essa parte do cogido?
     */

}
