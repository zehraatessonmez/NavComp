package com.zehraatessonmez.odevdort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.zehraatessonmez.odevdort.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)


        tasarim.gitYbutton.setOnClickListener {

            val gecis = SayfaBFragmentDirections.sayfaBdenYgidis()
            Navigation.findNavController(it).navigate(gecis)

        }


        return tasarim.root
    }


}