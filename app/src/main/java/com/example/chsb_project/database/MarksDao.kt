package com.example.chsb_project.database

import androidx.room.*

@Dao
interface MarksDao {
    @Insert
    suspend fun insert(mark: Mark)

    @Update
    suspend fun update(mark: Mark)

    @Delete
    suspend fun delete(mark: Mark)

    @Query("SELECT * FROM marks WHERE testId = :testId")
    suspend fun getMarksForTest(testId: Long): List<Mark>
}