package br.livro.android.ciclodevidaactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ExemploSmileAdapter extends ListActivity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        ArrayList<Smile> list = new ArrayList<Smile>();
        list.add(new Smile("Feliz", Smile.FELIZ));
        list.add(new Smile("Triste", Smile.TRISTE));
        list.add(new Smile("Louco", Smile.LOUCO));

        //Layout customizado para cada linha do Smile.
        setListAdapter(new SmileAdapter(this,list));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //Pega o Smile naquela posição:
        Smile smile = (Smile) this.getListAdapter().getItem(position);

        //Exibe alerta
        Toast.makeText(this, "Você selecionou o Smile: " + smile.nome, Toast.LENGTH_SHORT).show();
    }
}
