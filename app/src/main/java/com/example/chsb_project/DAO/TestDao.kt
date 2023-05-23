package com.example.chsb_project.DAO

import androidx.room.*
import com.example.chsb_project.Entity.Test

@Dao
interface TestDao {
    @Insert
    suspend fun insert(test: Test)

    @Update
    suspend fun update(test: Test)

    @Delete
    suspend fun delete(test: Test)

    @Query("SELECT * FROM tests")
    suspend fun getAllTests(): List<Test>
}