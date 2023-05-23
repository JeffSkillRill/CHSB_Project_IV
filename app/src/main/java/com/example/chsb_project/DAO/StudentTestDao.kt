package com.example.chsb_project.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.chsb_project.Entity.StudentTest


@Dao
interface StudentTestDao {


    @Insert
    fun addStudentTest(studentTest: StudentTest)

    @Delete
    fun deleteStudentTest(studentTest: StudentTest)


}