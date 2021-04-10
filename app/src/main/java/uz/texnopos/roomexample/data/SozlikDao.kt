package uz.texnopos.roomexample.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface SozlikDao {
    @Query("SELECT * FROM sozlik")
    fun getAllSozlik() : List<Sozlik>

    @Query("SELECT * FROM sozlik WHERE id=:id")
    fun getSozlikById(id: Int) : Sozlik
}