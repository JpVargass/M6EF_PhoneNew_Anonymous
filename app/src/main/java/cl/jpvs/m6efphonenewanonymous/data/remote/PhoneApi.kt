package cl.jpvs.m6efphonenewanonymous.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PhoneApi {
  //  Para obtener Listado
    @GET("products/")
    suspend fun getDataPhone(): Response<List<Phone>>

 //para obtener Detalle
 /* por implementar


    @GET("details/{id}")
    suspend fun getDetallephone(@Path("id")id:Int): Response<PhoneDetalle>

*/

}
