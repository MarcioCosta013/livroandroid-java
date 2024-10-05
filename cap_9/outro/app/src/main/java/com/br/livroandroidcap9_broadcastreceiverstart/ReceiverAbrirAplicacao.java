package com.br.livroandroidcap9_broadcastreceiverstart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class ReceiverAbrirAplicacao extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //É possivel iniciar uma activity ou service aqui
        Toast.makeText(context, "ReceiverAbrirAplicacao executando com sucesso", Toast.LENGTH_SHORT).show();
    }
}