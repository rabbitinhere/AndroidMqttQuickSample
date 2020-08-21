package com.ra.sample

import androidx.multidex.MultiDexApplication

class MyApplication : MultiDexApplication() {
    companion object {
        lateinit var ins: MyApplication
    }
    override fun onCreate() {
        super.onCreate()
        ins = this
    }
}