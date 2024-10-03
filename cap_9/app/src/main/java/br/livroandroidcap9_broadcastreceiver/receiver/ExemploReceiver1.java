package br.livroandroidcap9_broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExemploReceiver1 extends BroadcastReceiver {

    @Override
    public void onReceive(Context c, Intent intent) {
        Toast.makeText(c,"ExemploReceiver1 1", Toast.LENGTH_SHORT).show();
    }
}
