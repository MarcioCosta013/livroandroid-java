package br.livro.android.ciclodevidaactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SmileAdapter extends BaseAdapter {

    private Context context;
    private List<Smile> lista;

    public SmileAdapter(Context context, List<Smile> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Recupera o Smile da posição atual:
        Smile smile = lista.get(position);

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.smile_detalhes, null);

        //Atualiza o valor Text para o nome do Smile:
        TextView textNome = (TextView) v.findViewById(R.id.nome);
        textNome.setText(smile.nome);

        //Atualiza a imagem para a imagem do Smile.
        //A imagem é definida por um recurso no @drawable
        ImageView img = (ImageView) v.findViewById(R.id.img);
        img.setImageResource(smile.getImagem());
        return v;
    }
}
