package com.example.activityd

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    val monetaryAmounts = ArrayList<Double>()

    for (i in 1..5) {
        val amount = getUserInput("Enter monetary amount $i: ", scanner)
        monetaryAmounts.add(amount)
    }

    val divisor = getUserInput("Divide the total by: ", scanner)

    val total = monetaryAmounts.sum()
    val result = total / divisor

    println("Total: $total")
    println("Result: $result")
}

fun getUserInput(prompt: String, scanner: Scanner): Double {
    while (true) {
        print(prompt)
        try {
            return scanner.nextDouble()
        } catch (e: InputMismatchException) {
            println("Invalid input. Please enter a valid number.")
            scanner.next()
        }
    }
}