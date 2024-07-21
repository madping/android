package com.example.first

fun main()  {

   val han : String = "연습"

    //lateinit var han: String
    // var 사용 가능
    // Int, Long, Short, Double, Float, Byte 사용 못함



    println("hello world 1")
    println("hello world 2")

    println(add(4,5))
    println(sub(4,5))

    println(han)
    println("print value : $han")


}


fun add( a: Int, b: Int) : Int {

    return a+b
}


fun sub (c: Int, d: Int) : Int {

    return c-d
}