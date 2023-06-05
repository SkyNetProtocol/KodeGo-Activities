package com.example.testingapp.bertgrade

fun gradeOfBertInBiology() {
    println("What is the grade of Bert in Biology")
    when (readln()) {
        "1" -> {
            println("Bert's Grade in Biology is recorded")
        }
        "2" -> {
            println("Bert's Grade in Biology is recorded")
        }
        "3" -> {
            println("Bert's Grade in Biology is recorded")
        }
        "4" -> {
            println("Bert's Grade in Biology is recorded")
        }
        "5" -> {
            println("Bert's Grade in Biology is recorded")
        }
        "Drop" -> {
            println("Bert's Grade in Biology is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfBertInBiology()
        }
    }
}