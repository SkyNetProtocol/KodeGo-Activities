package com.example.testingapp.students

import com.example.testingapp.joegrade.*
import com.example.testingapp.usecases.inputGradeOf

fun gradeOfJoe() {
    // for Student at index 0
    gradeOfJoeInBiology()
    gradeOfJoeInHistory()
    gradeOfJoeInEngineeringDrawing()
    gradeOfJoeInPE()
    gradeOfJoeInTrigonometry()
    gradeOfJoeInAlgebra()
    gradeOfJoeInDifferentialCalculus()

    println("Type Back to Select the name of the Students you want to Input Grade")
    fun decideToGrade() {
        if (readln() == "Back") {
            inputGradeOf()
        } else {
            println("Please type the correct keyword")
            return (decideToGrade())
        }
    }
    decideToGrade()
}



//fun joeGradeBiology() {
//    when (readln()) {
//        "1" -> {
//            println("Joe's Grade in Biology is recorded")
//        }
//        "2" -> {
//            println("Joe's Grade in Biology is recorded")
//        }
//        "3" -> {
//            println("Joe's Grade in Biology is recorded")
//        }
//        "4" -> {
//            println("Joe's Grade in Biology is recorded")
//        }
//        "5" -> {
//            println("Joe's Grade in Biology is recorded")
//        }
//        "Drop" -> {
//            println("Joe's Grade in Biology is recorded")
//        }
//        else -> {
//            println("Please type accepted grade")
//            return joeGradeBiology()
//        }
//    }
//}