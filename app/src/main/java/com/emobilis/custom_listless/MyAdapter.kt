package com.emobilis.custom_listless

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mycntx:Context,var resources:Int, var item:List<Models>):ArrayAdapter<Models>(mycntx,resources,item) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutinflator:LayoutInflater=LayoutInflater.from(mycntx)
        val view:View=layoutinflator.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.image)
        val tv_title:TextView=view.findViewById(R.id.tv_maintxt)
        val tv_desc:TextView=view.findViewById(R.id.tv_subtext)

        var myitems:Models=item[position]
        imageview.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        tv_title.text=myitems.tittle
        tv_desc.text=myitems.description

        return view
    }
}