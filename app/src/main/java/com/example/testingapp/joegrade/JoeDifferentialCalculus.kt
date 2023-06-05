package com.example.testingapp.joegrade

fun gradeOfJoeInDifferentialCalculus() {
    println("What is the grade of Joe in Differential Calculus")
    when (readln()) {
        "1" -> {
            println("Joe's Grade in Differential Calculus is recorded")
        }
        "2" -> {
            println("Joe's Grade in Differential Calculus is recorded")
        }
        "3" -> {
            println("Joe's Grade in Differential Calculus is recorded")
        }
        "4" -> {
            println("Joe's Grade in Differential Calculus is recorded")
        }
        "5" -> {
            println("Joe's Grade in Differential Calculus is recorded")
        }
        "Drop" -> {
            println("Joe's Grade in Differential Calculus is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfJoeInDifferentialCalculus()
        }
    }
}