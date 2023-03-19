package com.appymize.broadcastereciever

import android.app.Notification.Action
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneMode : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isPlanModeEnable = intent?.getBooleanExtra("state",false) ?: return

        if (isPlanModeEnable){
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Airplane Mode Disable", Toast.LENGTH_SHORT).show()

        }



    }
}