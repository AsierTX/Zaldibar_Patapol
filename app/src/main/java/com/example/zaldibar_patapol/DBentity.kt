package com.example.zaldibar_patapol

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ranking")
data class DBentity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0,
    @ColumnInfo(name = "nombre")
    var nombre: String,
    @ColumnInfo(name = "tiempo")
    var pagar: String,
    @ColumnInfo(name = "top")
    var top: Int,
    )