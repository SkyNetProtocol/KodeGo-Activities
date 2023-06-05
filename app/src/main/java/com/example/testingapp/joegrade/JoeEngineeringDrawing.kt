package com.example.testingapp.joegrade

fun gradeOfJoeInEngineeringDrawing() {
    println("What is the grade of Joe in Engineering Drawing")
    when (readln()) {
        "1" -> {
            println("Joe's Grade in Engineering Drawing is recorded")
        }
        "2" -> {
            println("Joe's Grade in Engineering Drawing is recorded")
        }
        "3" -> {
            println("Joe's Grade in Engineering Drawing is recorded")
        }
        "4" -> {
            println("Joe's Grade in Engineering Drawing is recorded")
        }
        "5" -> {
            println("Joe's Grade in Engineering Drawing is recorded")
        }
        "Drop" -> {
            println("Joe's Grade in Engineering Drawing is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfJoeInEngineeringDrawing()
        }
    }
}