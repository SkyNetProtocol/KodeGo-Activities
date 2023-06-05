package com.example.testingapp.joegrade

fun gradeOfJoeInPE() {
    println("What is the grade of Joe in PE")
    when (readln()) {
        "1" -> {
            println("Joe's Grade in PE is recorded")
        }
        "2" -> {
            println("Joe's Grade in PE is recorded")
        }
        "3" -> {
            println("Joe's Grade in PE is recorded")
        }
        "4" -> {
            println("Joe's Grade in PE is recorded")
        }
        "5" -> {
            println("Joe's Grade in PE is recorded")
        }
        "Drop" -> {
            println("Joe's Grade in PE is recorded")
        }
        else -> {
            println("Please type accepted grade")
            return gradeOfJoeInPE()
        }
    }
}