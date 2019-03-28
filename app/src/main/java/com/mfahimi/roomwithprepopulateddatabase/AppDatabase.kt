package com.mfahimi.roomwithprepopulateddatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.mfahimi.roomwithprepopulateddatabase.Utility.AssetSQLiteOpenHelperFactory


@Database(entities = [content::class], version = 2)
abstract class AppDatabase : RoomDatabase() {

    abstract fun contentDao(): ContentDao

    companion object {
        fun getInstance(context: Context): AppDatabase {

            return Room.databaseBuilder(
                context.getApplicationContext(),
                AppDatabase::class.java,
                "phrase.db"
            )
                .openHelperFactory(AssetSQLiteOpenHelperFactory())
                .allowMainThreadQueries()
//                .addMigrations(MIGRATION_1_2)
                .build()
        }


        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
            }
        }
    }


}