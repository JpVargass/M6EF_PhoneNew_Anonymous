package cl.jpvs.m6efphonenewanonymous.presentacion

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import cl.jpvs.m6efphonenewanonymous.data.Repositorio
import cl.jpvs.m6efphonenewanonymous.data.local.PhoneDatabase
import cl.jpvs.m6efphonenewanonymous.data.remote.PhoneRetrofit
import kotlinx.coroutines.launch

class PhoneViewModel (applicaction: Application):AndroidViewModel(applicaction) {
     private val repositorio: Repositorio

     init {
         val api = PhoneRetrofit.getPhoneRetrofit()
         val phoneDatabase = PhoneDatabase.getDatabase(applicaction).getPhoneDao()
         repositorio = Repositorio(api, phoneDatabase)
     }
    fun getAllPhones() = viewModelScope.launch {
        repositorio.getPhones()
    }
}