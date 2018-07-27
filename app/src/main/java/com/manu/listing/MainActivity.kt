package com.manu.listing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list_data = ArrayList<String>()

        list_data.add("Unnikuttan A")
        list_data.add("Unnikuttan B")
        list_data.add("Unnikuttan C")
        list_data.add("Unnikuttan D")
        list_data.add("Unnikuttan E")
        list_data.add("Unnikuttan F")
        list_data.add("Unnikuttan G")
        list_data.add("Unnikuttan H")
        list_data.add("Unnikuttan I")
        list_data.add("Unnikuttan J")

        var adapter=NameAdapter(list_data)
        list.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        list.adapter=adapter
    }
}
