package com.example.a42416_tuan4.tuan4

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a42416_tuan4.R

class T4ListviewMainActivity : AppCompatActivity() {
    private var adapter: T4Adapter?=null
    private var ls=ArrayList<T4Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t4_listview_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        val lv=findViewById<ListView>(R.id.t4Listview)
        ls.add(T4Contact("Nguyen Van A","20",R.drawable.download))
        ls.add(T4Contact("Bui Van B","21",R.drawable.download1))
        ls.add(T4Contact("Nguyen Van C","20",R.drawable.download2))
        ls.add(T4Contact("Le Van D","23",R.drawable.download3))
        ls.add(T4Contact("Tran Van E","24",R.drawable.download4))
        ls.add(T4Contact("Giang A F","21",R.drawable.download5))
        ls.add(T4Contact("Ho Van G","20",R.drawable.download6))
        adapter= T4Adapter(ls,this)
        lv!!.adapter=adapter
    }
}
