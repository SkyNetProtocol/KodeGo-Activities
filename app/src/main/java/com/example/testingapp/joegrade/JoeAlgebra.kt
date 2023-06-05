package com.example.testingapp.joegrade

fun gradeOfJoeInAlgebra() {
    println("What is the grade of Joe in Algebra")
    when (readln()) {
        "1" -> {
            println("Joe's Grade in Algebra is recorded")
        }
        "2" -> {
            println("Joe's Grade in Algebra is recorded")
        }
        "3" -> {
            println("Joe's Grade in Algebra is recorded")
        }
        "4" -> {
            println("Joe's Grade in Algebra is recorded")
        }
        "5" -> {
            println("Joe's Grade in Algebra is recorded")
        }
        "Drop" -> {
            println("Joe's Grade in Algebra is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfJoeInAlgebra()
        }
    }
}