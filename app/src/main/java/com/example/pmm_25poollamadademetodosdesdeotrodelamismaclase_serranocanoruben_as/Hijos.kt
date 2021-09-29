package com.example.pmm_25poollamadademetodosdesdeotrodelamismaclase_serranocanoruben_as

class Hijos() {
    val edades = IntArray(5)

    fun cargar(){
        edades[0] = 17
        edades[1] = 24
        edades[2] = 32
        edades[3] = 21
        edades[4] = 12
    }

    fun mayorDeEdad():Int{
        var contador = 0
        for (e in edades)
            if (e >= 18)
                contador++
        return contador
    }

    fun promedio(): Double {
        var sumaEdades = 0.0
        for (e in edades)
            sumaEdades += e
        return sumaEdades / edades.size
    }
}