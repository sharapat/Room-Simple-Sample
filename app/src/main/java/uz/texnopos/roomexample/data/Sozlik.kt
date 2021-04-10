package uz.texnopos.roomexample.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Sozlik(
    @PrimaryKey
    var id: Int,
    var kar: String = "",
    var rus: String = "",
    var eng: String = ""
)
