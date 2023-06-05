package com.example.testingapp.joegrade


fun gradeOfJoeInHistory() {
    println("What is the grade of Joe in History")
    when (readln()) {
        "1" -> {
            println("Joe's Grade in History is recorded")
        }
        "2" -> {
            println("Joe's Grade in History is recorded")
        }
        "3" -> {
            println("Joe's Grade in History is recorded")
        }
        "4" -> {
            println("Joe's Grade in History is recorded")
        }
        "5" -> {
            println("Joe's Grade in History is recorded")
        }
        "Drop" -> {
            println("Joe's Grade in History is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfJoeInHistory()
        }
    }
}