package com.ozansoykan.kotlindersleri.nesneTabanli1

fun main(){
    val f = Fonksiyonlar()
    f.selamla1()
    println(f.selamla2())
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")
    f.selamla3("ozan")
    val gelenToplam = f.toplama(2,3)
    println("Toplam : $gelenToplam")

    f.carpma(3,4,"ozan")
}