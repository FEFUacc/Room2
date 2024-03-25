package com.example.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class MyDB : RoomDatabase() {
    abstract fun getUserDao() : UserDao
}