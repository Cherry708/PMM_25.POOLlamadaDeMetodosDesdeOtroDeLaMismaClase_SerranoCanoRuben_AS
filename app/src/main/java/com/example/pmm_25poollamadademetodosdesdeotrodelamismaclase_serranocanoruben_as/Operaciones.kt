package com.example.pmm_25poollamadademetodosdesdeotrodelamismaclase_serranocanoruben_as

class Operaciones(val integer0:Int, val integer1:Int) {

    constructor():this(0,0){}

    fun sumar():Int{
        return this.integer0+this.integer1
    }

    fun producto():Int{
        return this.integer0*this.integer1
    }
}