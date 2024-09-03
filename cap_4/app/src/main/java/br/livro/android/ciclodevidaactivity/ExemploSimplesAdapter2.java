package br.livro.android.ciclodevidaactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class ExemploSimplesAdapter2 extends ListActivity {

    @Override
    public void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);

        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        //Cada item da lista é uma lista.
        //Para determinar os valores existe um HashMap para cada linha.
        for (int i = 0; i < 10; i++){
            HashMap<String,String> item = new HashMap<String, String>();
            item.put("nome", "Nome "+ i);
            item.put("fone", "Fone " + i);
            list.add(item);
        }

        //Utiliza o adaptador SimpleAdapter.
        //Array que define as chaves do HashMap:
        String[] from = new String[]{"nome","fone"};

        //nome e fone são defenidos no layout_contatos.
        int[] to = new int[]{R.id.nome, R.id.fone};
        setListAdapter(new SimpleAdapter(this,list,R.layout.layout_contatos_fone,from, to));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //Pega o item naquela posição:
        Object o = this.getListAdapter().getItem(position);
        String item =o.toString();

        //Exibe um alerta
        Toast.makeText(this, "Você selecionou: " + item, Toast.LENGTH_SHORT).show();
    }
}
