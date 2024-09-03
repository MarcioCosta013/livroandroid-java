package br.livro.android.cap3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class Exemplo5 extends Activity {

    private static final String CATEGORIA = "livro";

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        //Verbose
        Log.v(CATEGORIA, "log verbose");

        //Debug
        Log.d(CATEGORIA, "log debug");

        //Info
        Log.i(CATEGORIA, "log Info");

        //Warn
        Log.w(CATEGORIA, "log alerta");

        //Error
        Log.e(CATEGORIA, "log erro", new RuntimeException("teste de erro"));
    }
}
