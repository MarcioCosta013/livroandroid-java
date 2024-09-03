package br.livro.android.ciclodevidaactivity;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExemploCicloVida extends AppCompatActivity {
    protected  static  final String CATEGORIA = "livro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    protected void onStart(){
        super.onStart();
        Log.i(CATEGORIA,  getClassName() + ".onStart() chamado"); //"getClassName foi criada abaixo".
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(CATEGORIA, getClassName() + ".onRestart() chamado");
    }

    protected  void  onResume(){
        super.onResume();
        Log.i(CATEGORIA, getClassName() + ".onResume() chamado");
    }

    protected void onPause(){
        super.onPause();
        Log.i(CATEGORIA, getClassName() + ".onPause() chamado");
    }

    protected void onStop(){
        super.onStop();
        Log.i(CATEGORIA, getClassName() + ".onStop() chamado");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado");
    }

    private String getClassName(){
        //Retorna o nome da classe sem o pacote
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}