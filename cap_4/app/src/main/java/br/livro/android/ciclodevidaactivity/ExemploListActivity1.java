package br.livro.android.ciclodevidaactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ExemploListActivity1 extends ListActivity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        //Array de Strings para visualizar na Lista:
        String[] itens = new String[] {"Nome1", "Nome2", "Nome3"};

        //Utiliza o adaptador ArrayAdapter, para exibir o array de Strings na tela:
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //Pega o item naquela posição
        Object o = this.getListAdapter().getItem(position);
        String item = o.toString();

        //Exibe um alerta:
        Toast.makeText(this,"Você selecionou: " + item, Toast.LENGTH_SHORT).show();
    }
}
/*
Codigo com a atualização dos metodos Deprecated: (Segundo o ChatGPT)

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main); // Define o layout da tela

        // Seus nomes
        List<String> nomes = Arrays.asList("Nome1", "Nome2", "Nome3");

        recyclerView = findViewById(R.id.recyclerView); // Encontra a lista no layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Organiza a lista em linha reta
        adapter = new MyAdapter(nomes, nome -> { // Cria o "garçom" e diz o que fazer ao clicar
            Toast.makeText(this, "Você selecionou: " + nome, Toast.LENGTH_SHORT).show();
        });
        recyclerView.setAdapter(adapter); // Coloca o "garçom" para servir a lista
    }

    // O "garçom" que organiza os nomes na lista
    public static class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        private List<String> nomes;
        private OnItemClickListener listener;

        public MyAdapter(List<String> nomes, OnItemClickListener listener) {
            this.nomes = nomes;
            this.listener = listener;
        }

        // Interface para definir o clique no item
        public interface OnItemClickListener {
            void onItemClick(String nome);
        }

        // Classe que representa cada item da lista
        public staticclass ViewHolder extends RecyclerView.ViewHolder {
            public TextView textView;

            public ViewHolder(View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.nomeTextView);
            }
        }

        // Cria a visualização de cada item
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_nome, parent, false); // Define o layout de cada item
            return new ViewHolder(itemView);
        }

        // Preenche cada item com um nome
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.textView.setText(nomes.get(position));
            holder.itemView.setOnClickListener(v -> { // Define o que acontece ao clicar no item
                listener.onItemClick(nomes.get(position));
            });
        }

        // Retorna a quantidade de nomes
        @Override
        public int getItemCount() {
            return nomes.size();
        }
    }
}
 */