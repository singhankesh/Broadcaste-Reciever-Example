package com.appymize.broadcastereciever

import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var reciever : AirplaneMode
    lateinit var bluetoothReciver : BluetoothReciver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reciever = AirplaneMode()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED) .also {
            registerReceiver(reciever,it)
        }
        //Bluetooth

        bluetoothReciver = BluetoothReciver()
        val filter = IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED)
        registerReceiver(bluetoothReciver,filter)


    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(reciever)
        unregisterReceiver(bluetoothReciver)
    }
}