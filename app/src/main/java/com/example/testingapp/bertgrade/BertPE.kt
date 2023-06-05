package com.example.testingapp.bertgrade

fun gradeOfBertInPE() {
    println("What is the grade of Bert in PE")
    when (readln()) {
        "1" -> {
            println("Bert's Grade in PE is recorded")
        }
        "2" -> {
            println("Bert's Grade in PE is recorded")
        }
        "3" -> {
            println("Bert's Grade in PE is recorded")
        }
        "4" -> {
            println("Bert's Grade in PE is recorded")
        }
        "5" -> {
            println("Bert's Grade in PE is recorded")
        }
        "Drop" -> {
            println("Bert's Grade in PE is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfBertInPE()
        }
    }
}