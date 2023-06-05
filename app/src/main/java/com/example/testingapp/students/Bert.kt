package com.example.testingapp.students

import com.example.testingapp.bertgrade.*
import com.example.testingapp.usecases.inputGradeOf

fun gradeOfBert(){
    // for Student at index 0
    gradeOfBertInBiology()
    gradeOfBertInHistory()
    gradeOfBertInEngineeringDrawing()
    gradeOfBertInPE()
    gradeOfBertInTrigonometry()
    gradeOfBertInAlgebra()
    gradeOfBertInDifferentialCalculus()

    println("Type Back to Select the name of the Students you want to Input Grade")
    fun decideToGrade1() {
        if (readln() == "Back") {
            inputGradeOf()
        } else {
            println("Please type the correct keyword")
            return (decideToGrade1())
        }
    }
    decideToGrade1()
}