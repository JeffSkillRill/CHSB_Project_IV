package com.example.chsb_project.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "teacher_test",
    foreignKeys = [

        ForeignKey(
            entity = User::class,
            parentColumns = ["user_id"],
            childColumns = ["teacher"]
        ),
        ForeignKey(
            entity = Test::class,
            parentColumns = ["test_id"],
            childColumns = ["test"]
        ),

    ]

)

data class TeacherTest(
    @PrimaryKey(autoGenerate = true) var teacher_id: Int,
    var teacher: Int,
    var test: Int,
    var studentId:Int
)