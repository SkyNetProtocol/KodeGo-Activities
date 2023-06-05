package com.example.testingapp.joegrade

fun gradeOfJoeInTrigonometry() {
    println("What is the grade of Joe in Trigonometry")
    when (readln()) {
        "1" -> {
            println("Joe's Grade in Trigonometry is recorded")
        }
        "2" -> {
            println("Joe's Grade in Trigonometry is recorded")
        }
        "3" -> {
            println("Joe's Grade in Trigonometry is recorded")
        }
        "4" -> {
            println("Joe's Grade in Trigonometry is recorded")
        }
        "5" -> {
            println("Joe's Grade in Trigonometry is recorded")
        }
        "Drop" -> {
            println("Joe's Grade in Trigonometry is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfJoeInTrigonometry()
        }
    }
}