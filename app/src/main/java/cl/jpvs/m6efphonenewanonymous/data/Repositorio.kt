package cl.jpvs.m6efphonenewanonymous.data

import android.util.Log
import cl.jpvs.m6efphonenewanonymous.data.local.PhoneDao
import cl.jpvs.m6efphonenewanonymous.data.local.detail.list.PhoneEntity
import cl.jpvs.m6efphonenewanonymous.data.remote.PhoneApi
// el repositorio es el administrador de los datos
class Repositorio(private val phoneApi : PhoneApi, private val phoneDao: PhoneDao) {
    suspend fun getPhones() {
        val response = phoneApi.getData() //aca captura los datos

        if (response.isSuccessful) {  //se obtuvieron correctamente
            val message = response.body()!!.message
            // Solo obtiene el mensaje, no tiene status
            val keys = message.keys
            keys.forEach {
                val phoneEntity = PhoneEntity(it)
                phoneDao.insertPhone(phoneEntity)
            }

        } else {
            Log.e("Repositorio", response.errorBody().toString())
        }
    }
}