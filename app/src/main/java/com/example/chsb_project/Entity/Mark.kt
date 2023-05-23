package com.example.chsb_project.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.chsb_project.Entity.Test
import com.example.chsb_project.Entity.User

@Entity(
    tableName = "marks",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["id"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE
        ),
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
    val id: Int = 0,
    val studentName: String,
    val testId: Int,
    val mark: Int
)