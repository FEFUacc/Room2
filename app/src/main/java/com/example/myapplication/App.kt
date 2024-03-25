package com.example.myapplication

import android.app.Application
import androidx.room.Room

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Dep.init(this)
    }
}