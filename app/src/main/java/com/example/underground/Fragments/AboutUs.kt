package com.example.underground.Fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.underground.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class AboutUs:Fragment(R.layout.aboutus) {
    private lateinit var imageButton: ImageButton
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageButton = view.findViewById(R.id.imageButton)

        imageButton.setOnClickListener{
            Toast.makeText(this@AboutUs.requireActivity(),"what",Toast.LENGTH_SHORT).show()
        }
    }
}