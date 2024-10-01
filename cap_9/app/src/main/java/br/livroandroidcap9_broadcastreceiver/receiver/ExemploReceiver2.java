package br.livroandroidcap9_broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExemploReceiver2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context c, Intent intent) {
        Toast.makeText(c,"BroadcastReceiver 2 configurado na API !", Toast.LENGTH_SHORT).show();
    }
}
