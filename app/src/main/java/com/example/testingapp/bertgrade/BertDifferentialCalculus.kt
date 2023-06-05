package com.example.testingapp.bertgrade

fun gradeOfBertInDifferentialCalculus() {
    println("What is the grade of Bert in Differential Calculus")
    when (readln()) {
        "1" -> {
            println("Bert's Grade in Differential Calculus is recorded")
        }
        "2" -> {
            println("Bert's Grade in Differential Calculus is recorded")
        }
        "3" -> {
            println("Bert's Grade in Differential Calculus is recorded")
        }
        "4" -> {
            println("Bert's Grade in Differential Calculus is recorded")
        }
        "5" -> {
            println("Bert's Grade in Differential Calculus is recorded")
        }
        "Drop" -> {
            println("Bert's Grade in Differential Calculus is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfBertInDifferentialCalculus()
        }
    }
}