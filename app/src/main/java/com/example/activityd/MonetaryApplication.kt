package com.example.activityd

fun main() {

    println("Please input any Philippine Peso monetary value")
    println("Note: Use 0.00 format")

//  In this program, Float is used instead of integer so that the resulting value is not rounded off

        val money1:Float = readln().toFloat()
        val money2:Float = readln().toFloat()
        val money3:Float = readln().toFloat()
        val money4:Float = readln().toFloat()
        val money5:Float = readln().toFloat()

        val myList :List<Float> = listOf(money1, money2, money3, money4, money5)
        println("Above values are the List of Monetary Value")
        println(myList.slice(0..4))

        println("Divide all of the Monetary value by how many?")
        val divisor:Int = readln().toInt()

        println("Since the total of the 5 inputs will be divided by the answer in the second question input, the final answer will be: ")
        val final = (money1 + money2 + money3 + money4 + money5)/divisor

        println("$final")

}