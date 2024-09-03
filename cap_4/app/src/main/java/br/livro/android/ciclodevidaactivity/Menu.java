package br.livro.android.ciclodevidaactivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class Menu extends ListActivity {
    private static final String[] nomes = new String[]{
            "Ciclo de Vida",
            "ExemploCicloDeVidaAbrirTela",
            "ExemploListActivity1",
            "ExemploListaContatos2",
            "ExemploSimplesAdapter1",
            "ExemploSimplesAdapter2",
            "ExemploSmileAdapter",
            "ExemploMapa",
            "Sair"
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
                startActivity(new Intent(this, ExemploCicloVida.class));
                break;

            case 1:
                startActivity(new Intent(this, ExemploCicloVideAbrirTela.class));
                break;
            case 2:
                startActivity(new Intent(this, ExemploListActivity1.class));
                break;
            case 3:
                startActivity(new Intent(this, ExemploListaContatos2.class));
                break;
            case 4:
                startActivity(new Intent(this, ExemploSimplesAdapter1.class));
                break;
            case 5:
                startActivity(new Intent(this, ExemploSimplesAdapter2.class));
                break;
            case 6:
                startActivity(new Intent(this, ExemploSmileAdapter.class));
                break;
            case 7:
                startActivity(new Intent(this, ExemploMapa.class));
                break;
            default:
                //Encerra a activity (encerra o ciclo de vida)
                    finish();
        }
    }
}
