package com.pm

class PersonKotlin {
    fun greeting(){
        println("Hello Kotlin")
    }
}

//1st level
fun main(){
    val p = PersonKotlin()
    p.greeting()
}