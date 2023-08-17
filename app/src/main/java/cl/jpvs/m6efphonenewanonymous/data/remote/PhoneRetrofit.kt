package cl.jpvs.m6efphonenewanonymous.data.remote

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PhoneRetrofit {
    companion object {
        private const val URL_BASE = "https://my-json-server.typicode.com/Himuravidal/FakeAPIdata/"  // url base donde se obtienen los datos

        fun getPhoneRetrofit() : PhoneApi {
            val mRetrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return  mRetrofit.create(PhoneApi::class.java)  // reflexion construye una instancia de PhoneApi


        }
    }
}