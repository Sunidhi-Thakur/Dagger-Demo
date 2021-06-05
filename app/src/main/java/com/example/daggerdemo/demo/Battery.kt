package com.example.daggerdemo.demo

import android.util.Log
import javax.inject.Inject

class Battery {

    @Inject
    constructor()
    fun addBattery(){
        Log.d("Sunidhi","Adding Battery ...")
    }
}