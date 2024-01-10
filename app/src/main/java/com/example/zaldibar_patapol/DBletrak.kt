package com.example.zaldibar_patapol

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "letrak")
data class DBletrak(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0,
    @ColumnInfo(name = "juego")
    var juego: String,
    @ColumnInfo(name = "ganado")
    var ganado: Boolean,
)