package com.example.chsb_project.DAO

import androidx.room.*
import com.example.chsb_project.Entity.Mark

@Dao
interface MarksDao {
    @Insert
    fun insert(mark: Mark)

    @Update
    fun update(mark: Mark)

    @Delete
    fun delete(mark: Mark)

    @Query("SELECT * FROM marks WHERE testId = :testId")
    fun getMarksForTest(testId: Long): List<Mark>
}