package com.pm.com.pm.score
              //建構子
class Student(var name:String, var english:Int, var math:Int){
    init {
        println("Testing")
    }
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage() :Int {
        return (english+math)/2
    }
}
fun main(){
    val jack = Student("Jack",25,79)
    jack.print()
    //println(jack.math)
}