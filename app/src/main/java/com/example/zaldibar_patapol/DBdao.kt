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

    @Query("DELETE FROM letrak")
    fun removeletra()

    @Query("DELETE FROM admin")
    fun removeadmin()

    @Query("SELECT * FROM ranking")
    fun getAllDatos(): List<DBentity>
    @Insert
    fun insertletra(entity: DBletrak)
    @Insert
    fun insertadmin(entity: DBadmin)
    @Query("SELECT COUNT(*) FROM letrak")
    fun countletrak(): Int?

    @Query("SELECT ganado FROM letrak WHERE juego = :numerojuego LIMIT 1")
    fun juegoganado(numerojuego: String):Boolean?


    @Query("UPDATE letrak SET ganado=1 WHERE juego='juego1'")
    fun juego1pasado()

    @Query("UPDATE letrak SET ganado=1 WHERE juego='juego2'")
    fun juego2pasado()

    @Query("UPDATE letrak SET ganado=1 WHERE juego='juego3'")
    fun juego3pasado()

    @Query("UPDATE letrak SET ganado=1 WHERE juego='juego4'")
    fun juego4pasado()

    @Query("UPDATE letrak SET ganado=1 WHERE juego='juego5'")
    fun juego5pasado()

    @Query("UPDATE letrak SET ganado=1 WHERE juego='juego6'")
    fun juego6pasado()

    @Query("UPDATE letrak SET ganado=1 WHERE juego='juego7'")
    fun juego7pasado()

    @Query("SELECT activado FROM admin")
    fun selectactivado():Boolean?

    @Query("UPDATE admin SET activado=1")
    fun updateactivado()

    @Query("UPDATE admin SET activado=0")
    fun updatedesactivado()
}