package com.appymize.broadcastereciever

import android.bluetooth.BluetoothAdapter
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BluetoothReciver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
       if (intent?.action == BluetoothAdapter.ACTION_STATE_CHANGED){

           val state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE,BluetoothAdapter.ERROR)

          if (state == BluetoothAdapter.STATE_TURNING_ON){
              Toast.makeText(context, "BlueTooth turning on", Toast.LENGTH_LONG).show()

          }else if (state == BluetoothAdapter.STATE_TURNING_OFF){
              Toast.makeText(context, "BlueTooth turning off", Toast.LENGTH_LONG).show()

          }


       }
    }
}