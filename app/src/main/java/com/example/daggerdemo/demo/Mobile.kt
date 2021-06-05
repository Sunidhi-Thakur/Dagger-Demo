package com.example.daggerdemo.demo

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(private val battery: Battery, private val processor: Processor) {

    fun startMobile(){
        processor.buildProcessor()
        battery.addBattery()
        Log.d("Sunidhi", "Phone is starting ...")
    }
}