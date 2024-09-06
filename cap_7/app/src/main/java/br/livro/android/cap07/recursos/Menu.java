package br.livro.android.cap07.recursos;

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
            "ExemploTextoCores",
            "ExemploMenu",
            "Sair"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(this, ExemploTextoCores.class));
                break;
            case 1:
                startActivity(new Intent(this, ExemploMenu.class));
                break;
            default:
                finish();
        }
    }
}
