package cl.jpvs.m6efphonenewanonymous.data

import android.util.Log
import androidx.lifecycle.LiveData
import cl.jpvs.m6efphonenewanonymous.data.local.PhoneDao
import cl.jpvs.m6efphonenewanonymous.data.local.detail.PhoneEntity
import cl.jpvs.m6efphonenewanonymous.data.remote.Phone
import cl.jpvs.m6efphonenewanonymous.data.remote.PhoneApi
// el repositorio es el administrador de los datos
class Repositorio(private val phoneApi : PhoneApi, private val phoneDao: PhoneDao) {
    fun getPhonesList() : LiveData<List<PhoneEntity>>  = phoneDao.getPhones()
    suspend fun ObtenerPhones() {
       try{
        val response = phoneApi.getDataPhone() //consume info de la Api

        if (response.isSuccessful) {
            val resp = response.body()
            // Solo obtiene el mensaje, no tiene status
            resp?.let { phones ->
                val phoneEntity = phones.map {it.transformar()}
                phoneDao.insertPhones(phoneEntity)

            }
            } else {
            Log.e("Repositorio", response.errorBody().toString())
        }

    } catch (exception: Exception){
        Log.e("catch","")

       }
    }
}

fun Phone.transformar(): PhoneEntity =
    PhoneEntity(this.id, this.name,this.price,this.image)
/*
*  @PrimaryKey val id: Int,
    val name: String,
    val price: Int,
    val image: String)*/