package com.ozansoykan.kotlindersleri.degiskenler

fun main(){
    var ogrenciAdi = "ozan"
    var ogrenciYas = 28
    var ogrenciBoyu = 1.73
    var ogrenciBasHarf = 'O'
    var ogrenciDurumu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoyu)
    println(ogrenciBasHarf)
    println(ogrenciDurumu)

    var urun_id : Int = 3416
    var urun_adi : String = "Macbook Pro"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 34.999
    var urun_tedarikci : String = "Apple"

    println("Ürün id : $urun_id")
    println("Ürün adı : $urun_adi")
    println("Ürün adedi : $urun_adet")
    println("ürün fiyat : $urun_fiyat ₺")
    println("ürün tedarikçi : $urun_tedarikci")

    var a = 10
    var b = 20

    println("$a x $b : ${a*b}")

    val number = 90 //constant
    println(number)
    //number = 40 Error


}

