package de.syntax_institut.telefonbuch.data.datamodels

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    var name: String,
    var number: String
    )
