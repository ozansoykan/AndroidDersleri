package com.ozansoykan.kotlindersleri.nesneTabanli1

fun main(){
    val bmw = Araba("Kırmızı",0,false)
    bmw.bilgiAl()
    bmw.renk = "Mavi"
    bmw.hiz = 50
    bmw.calisiyorMu = true
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.hizlan(30)
    bmw.bilgiAl()
    bmw.yavasla(10)
    bmw.bilgiAl()
    val sahin = Araba("beyaz",100,true)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
}