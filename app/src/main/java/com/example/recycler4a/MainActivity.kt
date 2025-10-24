package com.example.recycler4a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler4a.Modelos.LaptopModel
import com.example.recycler4a.Vistas.LaptopAdapter

class MainActivity : AppCompatActivity() {

    lateinit var rcvlaps: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //
        val laptops: LaptopModel= LaptopModel()

        rcvlaps=findViewById<RecyclerView>(R.id.rcvLaptps)
        rcvlaps.layoutManager= LinearLayoutManager(this)
        rcvlaps.adapter= LaptopAdapter(laptops.loadData())


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}