package com.ozansoykan.kotlindersleri.nesneTabanli1

class Araba(var renk : String , var hiz : Int , var calisiyorMu : Boolean) {
    init {
        println("nesne oluşturuldu")
    }
    fun calistir(){
        hiz = 5
        calisiyorMu = true
    }
    fun durdur(){
        hiz = 0
        calisiyorMu = false
    }
    fun hizlan(kacKm : Int){
        hiz += kacKm
    }
    fun yavasla(kacKm : Int){
        hiz -= kacKm
    }
    fun bilgiAl(){
        println("Renk : ${renk}")
        println("Hız : ${hiz}")
        println("Çalışıyor mu : ${calisiyorMu}")
        println("**********************************")
    }
}