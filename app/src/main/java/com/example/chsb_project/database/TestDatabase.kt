package com.example.chsb_project.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.chsb_project.DAO.MarksDao
import com.example.chsb_project.DAO.TestDao
import com.example.chsb_project.DAO.UserDao
import com.example.chsb_project.Entity.Mark
import com.example.chsb_project.Entity.Test
import com.example.chsb_project.Entity.User

@Database(entities = [User::class, Test::class, Mark::class], version = 1)
abstract class TestDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun testDao(): TestDao
    abstract fun markDao(): MarksDao

    companion object DatabaseManager{
        private var INSTANCE: TestDatabase? = null
        fun getDatabase(context: Context): TestDatabase {
            if (INSTANCE == null) {
                synchronized(TestDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            TestDatabase::class.java,
                            "test_database"
                        ).build()
                    }
                }
            }
            return INSTANCE!!
        }
    }
}



