package cl.jpvs.m6efphonenewanonymous.presentacion


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import cl.jpvs.m6efphonenewanonymous.R
import cl.jpvs.m6efphonenewanonymous.data.local.detail.PhoneEntity
import cl.jpvs.m6efphonenewanonymous.databinding.ItemPhoneListBinding
import coil.load

/*
[x ] item layout
[x] agregar constraints
[x] cambiar altura de constraints layout de item layout a wrap content
[X] definir ID
[x ] layout con recycler view
[X ] asignar layout manager
[x ] implementar clase Adapter
[x]  heredar RecyclerView.Adapter
[x] creaciones de los métodos: onCreateViewHolder, getItemCount y onBindViewHolder
[x ] crear clase anidada ViewHolder, que hereda de la clase ViewHolder
[x] Agregar constructor
[x] crear objeto, data class
[x] Crear lista
[x] asignar tamaño de la lista en getItemCount
[x] definir Binding Class del Item
[x] cambiar view por el binding
[x] declarar variable item en onBindViewHolder
[x] implementar binding en clase viewHolder
[x] Adapter+ view holder
[ x] obtener los datos
*/
class AdapterPhone :RecyclerView.Adapter<AdapterPhone.ItemPhoneViewHolder>(){
lateinit var binding: ItemPhoneListBinding
private val listItemPhone = mutableListOf<PhoneEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemPhoneViewHolder {
     binding = ItemPhoneListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
     return ItemPhoneViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return listItemPhone.size
    }


    override fun onBindViewHolder(holder: ItemPhoneViewHolder, position: Int) {
     val phonePlural = listItemPhone[position]
        holder.bind(phonePlural)

    }

    fun setData(phoneEntity: List< PhoneEntity>){
        this.listItemPhone.clear()
        this.listItemPhone.addAll(phoneEntity)
        notifyDataSetChanged()
    }
    class ItemPhoneViewHolder(val onePhone :ItemPhoneListBinding): RecyclerView.ViewHolder(onePhone.root) {
        fun bind(itemPhone : PhoneEntity) {
            val bundle = Bundle()
            onePhone.txtName.text = itemPhone.name
            onePhone.txtPrice.text = itemPhone.price.toString()
            onePhone.imgPhone.load(itemPhone.image)
            onePhone.cvItemphone.setOnClickListener{
                bundle.putInt("id",itemPhone.id)
                // navigation
                Navigation.findNavController(onePhone.root).navigate(R.id.action_listPhoneFragment_to_fragment_DetailPhone)
            }

        }
    }
}