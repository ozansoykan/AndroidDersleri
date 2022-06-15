package com.ozansoykan.kotlindersleri.nesneTabanli1

fun main(){
    val sonuc = 5 carp 2
    println("Sonuc : $sonuc")
}

infix fun Int.carp(sayi:Int):Int{
    return sayi * this
}