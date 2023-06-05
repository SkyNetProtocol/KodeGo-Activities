package com.example.testingapp.bertgrade

fun gradeOfBertInEngineeringDrawing() {
    println("What is the grade of Bert in Engineering Drawing")
    when (readln()) {
        "1" -> {
            println("Bert's Grade in Engineering Drawing is recorded")
        }
        "2" -> {
            println("Bert's Grade in Engineering Drawing is recorded")
        }
        "3" -> {
            println("Bert's Grade in Engineering Drawing is recorded")
        }
        "4" -> {
            println("Bert's Grade in Engineering Drawing is recorded")
        }
        "5" -> {
            println("Bert's Grade in Engineering Drawing is recorded")
        }
        "Drop" -> {
            println("Bert's Grade in Engineering Drawing is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfBertInEngineeringDrawing()
        }
    }
}