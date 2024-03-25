package com.example.myapplication

import android.app.Application
import android.content.Context
import androidx.room.Room

object Dep {

    private lateinit var applicationContext: Context

    val db: MyDB by lazy {
        Room.databaseBuilder(applicationContext, MyDB::class.java, "database.db")
            .build()
    }

    fun init(context: Context) {
        applicationContext = context
    }


}