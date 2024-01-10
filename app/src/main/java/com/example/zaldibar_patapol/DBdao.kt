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
    @Insert
    fun insertletra(entity: DBletrak)
    @Query("SELECT COUNT(*) FROM letrak")
    fun countletrak(): Int?

    @Query("SELECT ganado FROM letrak WHERE juego='juego1'")
    fun juego1ganado(): Boolean?

    @Query("SELECT ganado FROM letrak WHERE juego='juego2'")
    fun juego2ganado(): Boolean?

    @Query("SELECT ganado FROM letrak WHERE juego='juego3'")
    fun juego3ganado(): Boolean?

    @Query("SELECT ganado FROM letrak WHERE juego='juego4'")
    fun juego4ganado(): Boolean?

    @Query("SELECT ganado FROM letrak WHERE juego='juego5'")
    fun juego5ganado(): Boolean?

    @Query("SELECT ganado FROM letrak WHERE juego='juego6'")
    fun juego6ganado(): Boolean?

    @Query("SELECT ganado FROM letrak WHERE juego='juego7'")
    fun juego7ganado(): Boolean?

    @Query("UPDATE letrak SET ganado='true' WHERE juego='juego1'")
    fun juego1pasado()

    @Query("UPDATE letrak SET ganado='true' WHERE juego='juego2'")
    fun juego2pasado()

    @Query("UPDATE letrak SET ganado='true' WHERE juego='juego3'")
    fun juego3pasado()

    @Query("UPDATE letrak SET ganado='true' WHERE juego='juego4'")
    fun juego4pasado()

    @Query("UPDATE letrak SET ganado='true' WHERE juego='juego5'")
    fun juego5pasado()

    @Query("UPDATE letrak SET ganado='true' WHERE juego='juego6'")
    fun juego6pasado()

    @Query("UPDATE letrak SET ganado='true' WHERE juego='juego7'")
    fun juego7pasado()

}