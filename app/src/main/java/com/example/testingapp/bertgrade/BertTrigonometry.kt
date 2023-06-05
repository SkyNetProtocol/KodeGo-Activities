package com.example.testingapp.bertgrade

fun gradeOfBertInTrigonometry() {
    println("What is the grade of Bert in Trigonometry")
    when (readln()) {
        "1" -> {
            println("Bert's Grade in Trigonometry is recorded")
        }
        "2" -> {
            println("Bert's Grade in Trigonometry is recorded")
        }
        "3" -> {
            println("Bert's Grade in Trigonometry is recorded")
        }
        "4" -> {
            println("Bert's Grade in Trigonometry is recorded")
        }
        "5" -> {
            println("Bert's Grade in Trigonometry is recorded")
        }
        "Drop" -> {
            println("Bert's Grade in Trigonometry is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfBertInTrigonometry()
        }
    }
}