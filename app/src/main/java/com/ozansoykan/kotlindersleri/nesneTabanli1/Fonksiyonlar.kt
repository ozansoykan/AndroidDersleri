package com.ozansoykan.kotlindersleri.nesneTabanli1

class Fonksiyonlar {
    //void
    fun selamla1(){
        val sonuc = "merhaba ozan"
        println(sonuc)
    }
    //return
    fun selamla2() : String {
        val sonuc = "merhaba ozan"
        return sonuc
    }
    //parametreli
    fun selamla3(isim : String) {
        println("merhaba $isim")

    }

    fun toplama(sayi1:Int , sayi2:Int):Int{
        return sayi1 + sayi2
    }

    //overloading
    fun carpma(sayi1: Int,sayi2: Int){
        println("Sonuç : ${sayi1*sayi2}")
    }

    fun carpma(sayi1: Int,sayi2: Int,sayi3:Int){
        println("Sonuç : ${sayi1*sayi2*sayi3}")
    }

    fun carpma(sayi1: Int,sayi2: Int,isim:String){
        println("Sonuç : ${sayi1*sayi2} işlem yapan : $isim")
    }
}