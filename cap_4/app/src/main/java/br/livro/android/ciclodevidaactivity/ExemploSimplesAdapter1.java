package br.livro.android.ciclodevidaactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class ExemploSimplesAdapter1  extends ListActivity {

    @Override
    public void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        //Cada item de uma linha precisa ser um HashMap.
        //O HashMap contém chaves e valores necessários para preencher os elementos da tela.
        for (int i = 0; i < 10; i++){
            HashMap<String,String> item = new HashMap<String, String>();
            item.put("nome", "Nome "+ i);
            item.put("fone", "Fone " + i);
            list.add(item);
        }

        //Utiliza o adaptador SimpleAdapter.
        //Array que define as chaves do HashMap:
        String[] from = new String[]{"nome","fone"};

        //text1 e text2 são padrões do android para layout nativo "two_line_list_item".
        int[] to = new int[]{android.R.id.text1, android.R.id.text2};
        int layoutNativo = android.R.layout.two_line_list_item;
        setListAdapter(new SimpleAdapter(this,list,layoutNativo,from, to));
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
