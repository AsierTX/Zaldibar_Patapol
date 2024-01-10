package com.example.zaldibar_patapol

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DBentity::class, DBletrak::class], version = 1, exportSchema = false)
abstract class appdatabase : RoomDatabase() {
    abstract val DBdao: DBdao
    companion object {
        const val DATABASE_NAME = "DATABASE_NAME"
    }
}


