package com.mfahimi.roomwithprepopulateddatabase

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ContentDao {

    @Query("SELECT * FROM  content")
    fun getFirstItem(): List<content>
}