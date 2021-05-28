package com.example.appnotification

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var customBroadcast = MyReceiver()
        //val intentFilter = IntentFilter(Intent.ACTION_BOOT_COMPLETED)
        //registerReceiver(customBroadcast, intentFilter)
    }
}