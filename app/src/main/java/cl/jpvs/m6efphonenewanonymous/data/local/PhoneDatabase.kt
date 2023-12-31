package cl.jpvs.m6efphonenewanonymous.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cl.jpvs.m6efphonenewanonymous.data.local.detail.PhoneEntity

@Database(entities = [PhoneEntity::class], version = 1)
abstract class PhoneDatabase: RoomDatabase() {
    abstract fun getPhoneDao() :PhoneDao

    companion object{
        @Volatile
        private var INSTANCE:PhoneDatabase? = null
        fun getDatabase(context: Context): PhoneDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PhoneDatabase::class.java,
                    "phones_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}