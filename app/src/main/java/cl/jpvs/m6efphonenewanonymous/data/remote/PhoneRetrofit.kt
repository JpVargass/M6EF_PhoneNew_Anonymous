package cl.jpvs.m6efphonenewanonymous.data.remote


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PhoneRetrofit {
    companion object {
        private const val BASE_URL = "https://my-json-server.typicode.com/Himuravidal/FakeAPIdata/"  // url base donde se obtienen los datos

        fun getPhoneRetrofit() : PhoneApi {
            val mRetrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return  mRetrofit.create(PhoneApi::class.java)  // reflexion construye una instancia de PhoneApi


        }
    }
}