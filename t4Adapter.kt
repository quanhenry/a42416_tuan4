package com.example.a42416_tuan4.tuan4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.a42416_tuan4.R

class T4Adapter(val ls:ArrayList<T4Contact>, val context: Context):BaseAdapter() {
    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        var cvv=convertview
        val vax: ViewAX
        if(convertview==null){
            vax=ViewAX()
            cvv=LayoutInflater.from(context).inflate(R.layout.t4_item_view,null)
            vax.img_hinh=cvv!!.findViewById(R.id.t4ItemHinh)
            vax.tv_ten= cvv.findViewById(R.id.T4ItemTen)
            vax.tv_tuoi= cvv.findViewById(R.id.T4ItemTuoi)
            cvv.tag=vax
        }
        else{
            vax=cvv!!.tag as ViewAX
        }
        vax.img_hinh!!.setImageResource(ls[position].hinh)
        vax.tv_ten!!.text=ls[position].ten
        vax.tv_tuoi!!.text=ls[position].tuoi
        return cvv
    }
    internal inner class ViewAX{
        var img_hinh: ImageView?=null
        var tv_ten: TextView?=null
        var tv_tuoi: TextView?=null
    }


}
