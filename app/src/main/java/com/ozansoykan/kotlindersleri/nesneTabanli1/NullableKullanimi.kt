package com.ozansoykan.kotlindersleri.nesneTabanli1

fun main(){
    var str1 : String? = null
    //1.yöntem
    println("Sonuç ${str1?.trim()}")

    //2.yöntem

    //println("Sonuç 2 : ${str1!!.trim()}")

    //3. Yöntem
    if (str1 != null){
        println("Sonuç 3 : ${str1.trim()}")
    }else{
        println("sonuç nulldur.")
    }

    //4.Yöntem
    str1?.let {
        println("Sonuç 4 : ${str1.trim()}")
    }

}