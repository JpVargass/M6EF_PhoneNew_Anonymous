package cl.jpvs.m6efphonenewanonymous.data.remote

import cl.jpvs.m6efphonenewanonymous.data.local.detail.PhoneDetailEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PhoneApi {
  //  Para obtener Listado
    @GET("products/")
    suspend fun getDataPhone(): Response<List<Phone>>

 //para obtener Detalle
 /* por implementar*/


    @GET("details/{id}")
    suspend fun getDetailPhone(@Path("id")id:Int): Response<PhoneDetail>



}
