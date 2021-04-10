package uz.texnopos.roomexample.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Sozlik::class], version = 1)
abstract class SozlikDatabase : RoomDatabase() {
    companion object {
        lateinit var INSTANCE: SozlikDatabase
        fun getInstance(context: Context) : SozlikDatabase {
            if (!::INSTANCE.isInitialized) {
                INSTANCE = Room.databaseBuilder(context, SozlikDatabase::class.java, "my_database")
                    .createFromAsset("database.db")
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE
        }
    }

    abstract fun dao() : SozlikDao
}