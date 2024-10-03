package br.livroandroidcap9_broadcastreceiver;

import android.app.ListActivity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.livroandroidcap9_broadcastreceiver.receiver.ExemploReceiver2;

public class Menu extends ListActivity {
    private static final String[] nomes = new String[]{
            "Exemplo 1",
            "Exemplo 2",
            "Exemplo 3 Erro ANR",
            "Exemplo 4 - iniciar activity"
    };

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes));

        //Registra um BroadcastReceiver pela API
        registerReceiver(new ExemploReceiver2(), new IntentFilter("ABRIR_RECEIVER_2")); //registrando dinamicamente o "ExemploReceiver2" em onCreate.
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                //Chama o BroadcatReceiver1
                sendBroadcast(new Intent("ABRIR_RECEIVER_1"));
                break;
            case 1:
                //Chama o BroadcatReceiver2
                sendBroadcast(new Intent("ABRIR_RECEIVER_2"));
                break;
            case 2:
                //Chama o ExemploReceiverANR
                sendBroadcast(new Intent("TESTE_ANR"));
                break;
            case 3:
                //Chama o BroadcastReceiver e abrir a activity TelaTeste
                sendBroadcast(new Intent("ABRIR_TELA_TESTE"));
                break;
            default:
                finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Remove o BroadcastReceiver
        unregisterReceiver(new ExemploReceiver2());
    }
}