package com.example.recycler4a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler4a.Contratos.ContratoLaptop
import com.example.recycler4a.Modelos.LaptopData
import com.example.recycler4a.Modelos.LaptopModel
import com.example.recycler4a.Presentadores.LaptopPresentador
import com.example.recycler4a.Vistas.LaptopAdapter

class MainActivity : AppCompatActivity(), ContratoLaptop.Vista {

    lateinit var rcvlaps: RecyclerView
    lateinit var presentador: LaptopPresentador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //configuramos el objeto
        rcvlaps=findViewById<RecyclerView>(R.id.rcvLaptps)
        rcvlaps.layoutManager= LinearLayoutManager(this)

        presentador= LaptopPresentador(this)
        presentador.LoadData()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun LoadData(lista: List<LaptopData>) {
        rcvlaps.adapter= LaptopAdapter(lista)
    }
}