package com.example.chsb_project.database

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "marks",
    foreignKeys = [
        ForeignKey(
            entity = Test::class,
            parentColumns = ["id"],
            childColumns = ["testId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Mark(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val studentName: String,
    val testId: Long,
    val mark: Int
)