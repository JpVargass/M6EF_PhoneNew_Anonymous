package cl.jpvs.m6efphonenewanonymous.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cl.jpvs.m6efphonenewanonymous.data.local.detail.PhoneEntity


@Dao
interface PhoneDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPhones(phoneEntity : List<PhoneEntity>)  //insertar datos de Phone

    @Query("Select * from table_phone order by id ASC")  //consular a la tabla y ordenar ascendente
    fun getPhones() : LiveData<List<PhoneEntity>>

}