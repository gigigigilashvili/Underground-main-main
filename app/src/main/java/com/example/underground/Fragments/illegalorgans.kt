package com.example.underground.Fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.commitNow
import com.example.underground.R

class illegalorgans:Fragment(R.layout.illorgans) {
    private lateinit var imagebutton: ImageButton
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imagebutton = view.findViewById(R.id.imageButton21)
        imagebutton.setOnClickListener{
            val esa = Home()
            val fragmentManager = parentFragmentManager
            fragmentManager.commitNow {
                setReorderingAllowed(true)
                replace(R.id.nav_host_fragment, esa)
            }
        }
    }
}