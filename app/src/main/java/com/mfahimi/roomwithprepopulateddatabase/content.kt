package com.mfahimi.roomwithprepopulateddatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "content")
class content(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val number: Int,
    val english: String?,
    val persian: String?,
    val describe: String = "1",
    val subject: Int = 111,
    val fav: Int = 0
)