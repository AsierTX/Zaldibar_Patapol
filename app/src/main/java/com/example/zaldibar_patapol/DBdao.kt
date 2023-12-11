package com.example.zaldibar_patapol

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DBdao {
    @Insert
    fun insert(entity: DBentity)

    @Update
    fun update(entity: DBentity)

    @Delete
    fun delete(entity: DBentity)

    @Query("DELETE FROM ranking")
    fun removeall()

    @Query("SELECT * FROM ranking")
    fun getAllDatos(): List<DBentity>

}