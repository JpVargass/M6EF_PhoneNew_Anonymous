package cl.jpvs.m6efphonenewanonymous.presentacion

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import cl.jpvs.m6efphonenewanonymous.data.Repositorio
import cl.jpvs.m6efphonenewanonymous.data.local.PhoneDatabase
import cl.jpvs.m6efphonenewanonymous.data.remote.PhoneRetrofit
import kotlinx.coroutines.launch

class PhoneViewModel (application: Application):AndroidViewModel(application) {
     private val repositorio: Repositorio

     fun phoneLiveData() = repositorio.getPhonesList()
     init {
         val api = PhoneRetrofit.getPhoneRetrofit()
         val phoneDatabase = PhoneDatabase.getDatabase(application).getPhoneDao()
         repositorio = Repositorio(api, phoneDatabase)
     }
    fun getAllPhones() = viewModelScope.launch {
        repositorio.getPhones()
    }
}