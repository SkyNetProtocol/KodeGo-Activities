package com.example.testingapp.joegrade

fun gradeOfJoeInBiology() {
    // for Student at index 0
    println("What is the grade of Joe in Biology")
    println("Accepted grade is 1, 2, 3, 4, 5 and Drop")
    when (readln()) {
        "1" -> {
            println("Joe's Grade in Biology is recorded")
        }
        "2" -> {
            println("Joe's Grade in Biology is recorded")
        }
        "3" -> {
            println("Joe's Grade in Biology is recorded")
        }
        "4" -> {
            println("Joe's Grade in Biology is recorded")
        }
        "5" -> {
            println("Joe's Grade in Biology is recorded")
        }
        "Drop" -> {
            println("Joe's Grade in Biology is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfJoeInBiology()
        }
    }
}