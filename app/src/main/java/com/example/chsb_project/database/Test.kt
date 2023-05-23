package com.example.chsb_project.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tests")
data class Test(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val score: Int
)