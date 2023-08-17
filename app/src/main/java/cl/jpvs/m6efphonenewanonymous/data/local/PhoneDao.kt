package cl.jpvs.m6efphonenewanonymous.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cl.jpvs.m6efphonenewanonymous.data.local.detail.list.PhoneEntity

@Dao
interface PhoneDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPhone(phoneEntity : PhoneEntity)  //insertar datos de Phone

    @Query("Select * from table_phone order by id ASC")  //consular a la tabla y ordenar ascendente
    fun getPhone() : LiveData<List<PhoneEntity>>

}