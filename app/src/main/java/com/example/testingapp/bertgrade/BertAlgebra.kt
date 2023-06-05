package com.example.testingapp.bertgrade

fun gradeOfBertInAlgebra() {
    println("What is the grade of Bert in Algebra")
    when (readln()) {
        "1" -> {
            println("Bert's Grade in Algebra is recorded")
        }
        "2" -> {
            println("Bert's Grade in Algebra is recorded")
        }
        "3" -> {
            println("Bert's Grade in Algebra is recorded")
        }
        "4" -> {
            println("Bert's Grade in Algebra is recorded")
        }
        "5" -> {
            println("Bert's Grade in Algebra is recorded")
        }
        "Drop" -> {
            println("Bert's Grade in Algebra is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfBertInAlgebra()
        }
    }
}