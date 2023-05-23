package com.example.chsb_project.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(
    tableName = "student_test",
    foreignKeys = [

        ForeignKey(
            entity = Test::class,
            parentColumns = ["test_id"],
            childColumns = ["test"]
        )


    ]

)

data class StudentTest(
    @PrimaryKey(autoGenerate = true) var studentTest: Int,
    var test: Int
)