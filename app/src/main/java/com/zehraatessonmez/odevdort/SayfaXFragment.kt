package com.zehraatessonmez.odevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.zehraatessonmez.odevdort.databinding.FragmentSayfaBBinding
import com.zehraatessonmez.odevdort.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {

    private lateinit var tasarim: FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)


        tasarim.gitYikibutton.setOnClickListener {

            val gecis = SayfaXFragmentDirections.sayfaXtenYgidis()
            Navigation.findNavController(it).navigate(gecis)

        }

        return tasarim.root
    }



}