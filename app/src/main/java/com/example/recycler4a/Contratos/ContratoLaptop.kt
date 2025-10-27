package com.example.recycler4a.Contratos

import com.example.recycler4a.Modelos.LaptopData

interface ContratoLaptop {
    interface Modelo{
        fun LoadData(): List<LaptopData>
    }
    interface Presentador{
        fun LoadData()
    }
    interface Vista{
        fun LoadData(lista: List<LaptopData>)
    }
}