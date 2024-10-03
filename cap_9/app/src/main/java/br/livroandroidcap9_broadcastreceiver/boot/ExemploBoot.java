package br.livroandroidcap9_broadcastreceiver.boot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ExemploBoot extends BroadcastReceiver {
    private static final String CATEGORIA = "livro";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(CATEGORIA, "O sistema operacional foi iniciado com sucesso.");
    }
}
