package com.zehraatessonmez.odevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.zehraatessonmez.odevdort.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)


        tasarim.gitAbutton2.setOnClickListener {

        val gecis = AnasayfaFragmentDirections.sayfaAgidis()
        Navigation.findNavController(it).navigate(gecis)

        }


        tasarim.gitXbutton2.setOnClickListener {

            val gecis = AnasayfaFragmentDirections.sayfaXgidis()
            Navigation.findNavController(it).navigate(gecis)

        }

        return tasarim.root
    }


}