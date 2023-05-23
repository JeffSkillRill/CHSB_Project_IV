package com.example.chsb_project.DAO

import androidx.room.*
import com.example.chsb_project.Entity.Subject
import com.example.chsb_project.Entity.TeacherTest
import com.example.chsb_project.Entity.User

@Dao
interface TeacherTestDao {
    @Insert
    fun addTeacherTest(teacherTest: TeacherTest)

    @Delete
    fun deleteTeacherTest(teacherTest: TeacherTest)


    @Query("select * from teacher_test where teacher_id = :id")
    fun getTeacherTestById(id:Int): TeacherTest

    @Insert
    fun addMark(subject: Subject, user: User):Boolean

}