package br.livro.android.cap07.recursos;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ExemploMenu extends Activity {

    public static final int NOVO = 0;
    public static final int SALVAR = 1;
    public static final int EXCLUIR = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView view = new TextView(this);
        view.setText("Exemplo Menu");
        setContentView(view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        //Adiciona três opções no menu
        MenuItem item = menu.add(0, NOVO,0,"Novo");
        item.setIcon(R.drawable.mais);
        menu.add(0, SALVAR,1,"Salvar");
        item.setIcon(R.drawable.verificar);
        menu.add(0, EXCLUIR,2,"Excluir");
        item.setIcon(R.drawable.cruz);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()){
            case NOVO:
                Toast.makeText(ExemploMenu.this, "Novo", Toast.LENGTH_SHORT).show();
                return true;
            case SALVAR:
                Toast.makeText(ExemploMenu.this,"Salvar",Toast.LENGTH_SHORT).show();
                return true;
            case EXCLUIR:
                Toast.makeText(ExemploMenu.this, "Excluir",Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}
