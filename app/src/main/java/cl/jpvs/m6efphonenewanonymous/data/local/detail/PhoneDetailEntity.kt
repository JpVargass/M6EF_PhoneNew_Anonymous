package cl.jpvs.m6efphonenewanonymous.data.local.detail

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_phone")
class PhoneDetailEntity (
    @PrimaryKey val id:Int,
    val name :String,
    val price: Int,
    val image: String
)
