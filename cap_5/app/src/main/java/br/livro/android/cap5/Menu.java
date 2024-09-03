package br.livro.android.cap5;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Menu extends ListActivity {
    private static final String[] nomes = new String[]{
            "ExemploAbrirBrowser",
            "ExemploLigar",
            "ExemploVerContato",
            "ExemploVerTodosContatos",
            "ExemploVerContatosBanco",
            "ExemploSimOuNao"
    };

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(this, ExemploAbrirBrowser.class));
                break;
            case 1:
                startActivity(new Intent(this, ExemploLigar.class));
                break;
            case 2:
                startActivity(new Intent(this, ExemploVerContato.class));
                break;
            case 3:
                startActivity(new Intent(this, ExemploVerTodosContatos.class));
                break;
            case 4:
                startActivity(new Intent(this, ExemploVerContatosBanco.class));
                break;
            case 5:
                startActivityForResult(new Intent(this, ExemploSimNao.class),ACTIVITY_SIM_NAO);
                break;
            default:
                finish();
        }

    }
    private static final int ACTIVITY_SIM_NAO = 1;

//    public void onClick(View v){
//        startActivityForResult(new Intent(this, ExemploSimNao.class),ACTIVITY_SIM_NAO);
//    }

    protected void onActivityResult(int codigo, int resultado,Intent it){
        if (codigo == ACTIVITY_SIM_NAO){
            Bundle params = it != null ? it.getExtras(): null;
            if (params != null){
                String msg = params.getString("msg");
                if (resultado == 1){
                    //Sim
                    Toast.makeText(this,"Escolheu sim: " + msg,Toast.LENGTH_SHORT).show();
                } else if (resultado == 2) {
                    //Nao
                    Toast.makeText(this, "Escolheu Não: " + msg,Toast.LENGTH_SHORT).show();
                } else {
                    //Cancelado talvez
                    Toast.makeText(this, "Não de defenido: " + msg, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
