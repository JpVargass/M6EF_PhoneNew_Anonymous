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



private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListPhoneFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListPhoneFragment : Fragment() {
    lateinit var binding: FragmentListPhoneBinding
    private val phoneViewModel : PhoneViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
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
         phoneViewModel
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListPhoneFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListPhoneFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}