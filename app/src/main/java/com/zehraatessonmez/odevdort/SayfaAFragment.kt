package com.zehraatessonmez.odevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.zehraatessonmez.odevdort.databinding.FragmentAnasayfaBinding
import com.zehraatessonmez.odevdort.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var tasarim:FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)


        tasarim.gitBbutton.setOnClickListener {

            val gecis = SayfaAFragmentDirections.sayfaBgidis()
            Navigation.findNavController(it).navigate(gecis)

        }

        return tasarim.root
    }


}