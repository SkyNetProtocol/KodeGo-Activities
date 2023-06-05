package com.example.testingapp.bertgrade

fun gradeOfBertInHistory() {
    println("What is the grade of Bert in History")
    when (readln()) {
        "1" -> {
            println("Bert's Grade in History is recorded")
        }
        "2" -> {
            println("Bert's Grade in History is recorded")
        }
        "3" -> {
            println("Bert's Grade in History is recorded")
        }
        "4" -> {
            println("Bert's Grade in History is recorded")
        }
        "5" -> {
            println("Bert's Grade in History is recorded")
        }
        "Drop" -> {
            println("Bert's Grade in History is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfBertInHistory()
        }
    }
}