package com.example.zaldibar_patapol

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.zaldibar_patapol.DBdao
import com.example.zaldibar_patapol.DBentity

@Database(entities = [DBentity::class], version = 1, exportSchema = false)
abstract class appdatabase : RoomDatabase() {
    abstract val DBdao: DBdao
    companion object {
        const val DATABASE_NAME = "DATABASE_NAME"
    }
}


