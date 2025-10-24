package com.example.recycler4a.Vistas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler4a.Modelos.LaptopData
import com.example.recycler4a.R
import kotlin.random.Random

class LaptopAdapter(val laptops: List<LaptopData>):
RecyclerView.Adapter<LaptopAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): ViewHolder {
        val vista= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_laptop,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val laptop=laptops[position]
        holder.txvModelo.text=laptop.nombre
        holder.txvMarca.text=laptop.marca
    }

    override fun getItemCount(): Int {
        return laptops.size
    }

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val txvModelo= ItemView.findViewById<TextView>(R.id.txvmodel)
        val txvMarca=ItemView.findViewById<TextView>(R.id.txvMarca)
    }
}