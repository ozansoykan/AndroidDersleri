package com.ozansoykan.kotlindersleri.degiskenler

fun main(){
    //sayısaldan sayısala
    val i = 42
    val d = 78.15

    val sonuc1 = i.toDouble()
    println(sonuc1)

    val sonuc2 = d.toInt()
    println(sonuc2)

    //sayısaldan metine
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()

    println(sonuc3)
    println(sonuc4)

    //metinden sayısala
    val yazi = "55.55"
    val sonuc5 = yazi.toDoubleOrNull()
    if(sonuc5 != null){
        println(sonuc5)
    }else{
        println("girdi değeri yanlış...")
    }

    sonuc5?.let {
        println(sonuc5)
    }
}