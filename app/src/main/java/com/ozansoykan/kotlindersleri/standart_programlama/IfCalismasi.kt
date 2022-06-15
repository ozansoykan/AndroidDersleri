package com.ozansoykan.kotlindersleri.standart_programlama

fun main(){
    val yas = 17
    val isim = "Mehmet"

    if(yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    if(isim == "Ahmet"){
        println("merhaba Ahmet")
    }
    else if(isim == "Mehmet"){
        println("Merhaba Mehmet")
    }
    else{
        println("merhaba")
    }

    val ka = "admin"
    val s = 123456

    if (ka == "admin" && s == 123456){
        println("Hoşgeldiniz")
    }
    else{
        println("Hatalı giriş")
    }

    val sayi = 10
    if (sayi == 10 || sayi == 20){
        println("sayı 10 veya 20")
    }else{
        println("sayı 10 veya 20 değil")
    }

    val gun = 3
    when(gun){
        1-> println("pazartesi")
        2-> println("salı")
        3-> println("çarşamba")
        4-> println("perşembe")
        5-> println("cuma")
        6-> println("cumartesi")
        7-> println("pazar")
        else-> println("pazartesi")
    }
}