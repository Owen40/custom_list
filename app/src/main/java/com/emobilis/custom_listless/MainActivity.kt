package com.emobilis.custom_listless

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Models>()

        // Adding images
        list.add(Models("Nvidia 4080","This is the Founders edition",R.drawable.nvidia))
        list.add(Models("RTX 4080","This is the Strix version",R.drawable.strix))
        list.add(Models("Gigabyte","This is the Aorus version",R.drawable.aorus))
        list.add(Models("Zephyrus","This is the asus gaming laptop",R.drawable.asus)
        list.add(Models("Suprim","This is the MSI extreme GPU",R.drawable.suprim))
        list.add(Models("Ventus","This is the MSI budget version",R.drawable.ventus))

        listview.adapter=MyAdapter(this,R.layout.row,list)
    }
}