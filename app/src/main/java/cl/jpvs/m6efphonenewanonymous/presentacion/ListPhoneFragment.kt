package cl.jpvs.m6efphonenewanonymous.presentacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.activityViewModels
import cl.jpvs.m6efphonenewanonymous.R
import cl.jpvs.m6efphonenewanonymous.databinding.FragmentListPhoneBinding

class ListPhoneFragment : Fragment() {
    lateinit var binding: FragmentListPhoneBinding
    private val phoneViewModel : PhoneViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListPhoneBinding.inflate(layoutInflater, container, false)
        initAdapter()
        phoneViewModel.getAllPhones()
        return binding.root
    }

    private fun initAdapter() {
        val adapter = AdapterPhone()
        binding.recyclerPhone.adapter = adapter
         phoneViewModel.phoneLiveData().observe(viewLifecycleOwner){
             adapter.setData(it)
         }
    }

}