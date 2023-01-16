package com.example.underground.Fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.commitNow
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.underground.R
import com.example.underground.dataa.Data
import com.example.underground.recycler.recyclerview

class legalorgans:Fragment(R.layout.lorgans) {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Data>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var price: Array<String>
    private lateinit var imagebutton: ImageButton
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageId = arrayOf(
            R.drawable.lungs_cropped2,
            R.drawable._22_1220432_transparent_real_heart_png_real_human_heart_png,
            R.drawable.kidneys,
            R.drawable.download,
            R.drawable.human_liver

        )
        heading = arrayOf(
            "Lungs",
            "Heart",
            "Kidneys",
            "Brain",
            "Liver"
        )
        price = arrayOf(
            "1,315,863.85$",
            "1,000,000$",
            "262,000$ (each)",
            "1,500,000,00$",
            "557,000$"
        )

        newRecyclerView = view.findViewById(R.id.recyclerViewMenu)
        newRecyclerView.layoutManager = LinearLayoutManager(this.requireActivity())
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Data>()
        getUserdata()

        imagebutton = view.findViewById(R.id.imageButton20)
        imagebutton.setOnClickListener{
            val esa = Home()
            val fragmentManager = parentFragmentManager
            fragmentManager.commitNow {
                setReorderingAllowed(true)
                replace(R.id.nav_host_fragment, esa)
            }
        }
    }

    private fun getUserdata() {
        for(i in imageId.indices){

            val data = Data(imageId[i],heading[i],price[i])
            newArrayList.add(data)
        }

        var adapter = recyclerview(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.onItemClickListener(object : recyclerview.onItemClickListener{
            override fun onItemClick(position: Int) {


            }

        })

    }
}