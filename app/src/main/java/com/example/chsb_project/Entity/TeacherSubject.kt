package com.example.chsb_project.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "teacher_subjects",
    foreignKeys = [

        ForeignKey(
            entity = User::class,
            parentColumns = ["user_id"],
            childColumns = ["teacher"]
        ),
        ForeignKey(
            entity = Subject::class,
            parentColumns = ["subject_id"],
            childColumns = ["subject"]
        )


    ]

)

data class TeacherSubject(
    @PrimaryKey(autoGenerate = true) var teacher_id: Int,
    var teacher: Int,
    var subject: Int,
)