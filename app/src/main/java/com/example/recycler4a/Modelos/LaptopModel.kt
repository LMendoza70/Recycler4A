package com.example.recycler4a.Modelos

import com.example.recycler4a.Contratos.ContratoLaptop

class LaptopModel: ContratoLaptop.Modelo {
    //declaramos la lista de laptops que tenemos
    // para deplegar en nuestro recycler
    lateinit var lista: List<LaptopData>

    override fun LoadData(): List<LaptopData>{
        lista=listOf(
            LaptopData(1, "ThinkPad T16", "Lenovo",
                "Equipo de alto rendimiento",16,512,
                120,16.4F),
            LaptopData(2, "Asus a15", "Asus",
                "Equipo de bajo rendimiento",8,256,
                30,14F),
            LaptopData(1, "Acer NitroV16", "Acer",
                "Equipo desechable",16,1024,
                135,16.7F),
        )
        return  lista
    }
}