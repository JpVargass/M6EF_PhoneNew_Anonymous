package cl.jpvs.m6efphonenewanonymous

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
[] 2 pantallas: Listado y detalle
[x] Permiso de internet
[x] ViewBinding
[x] Dependencias: Coil, Room, Retrofit, navigation, viewModel
[] Remoto:
  [x] Dataclass
  [x] API (interfaz)
  [x] Retrofit
[] Local:
  [x] Database
  [x] Entity
  [x] DAO
[] Repositorio
[ ] Vistas
  [] ViewModel
[] Fragmento Listado
  [] xml [ ] recyclerview
  [] codigo
[]  Acvtivy_main.xlm - framlayou
[] agregar item.xml
[] Agregar Navigation "nav_phone"




[] navigation
[] Listado: RecyclerView + ViewHolder + Adapter
[] Detalle: RecyclerView + ViewHolder + Adapter


 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}