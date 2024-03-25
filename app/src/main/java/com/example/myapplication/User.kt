package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class User (
    val login: String,
    val password: String,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)
