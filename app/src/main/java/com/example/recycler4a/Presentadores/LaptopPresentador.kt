package com.example.recycler4a.Presentadores

import com.example.recycler4a.Contratos.ContratoLaptop
import com.example.recycler4a.Modelos.LaptopData
import com.example.recycler4a.Modelos.LaptopModel

class LaptopPresentador(val vista: ContratoLaptop.Vista): ContratoLaptop.Presentador {

    val modelo= LaptopModel()
    override fun LoadData() {
        val lista= modelo.LoadData()
        vista.LoadData(lista)
    }
}