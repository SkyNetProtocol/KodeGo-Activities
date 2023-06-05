package com.example.testingapp.usecases

import com.example.testingapp.students.gradeOfAlex
import com.example.testingapp.students.gradeOfAna
import com.example.testingapp.students.gradeOfBert
import com.example.testingapp.students.gradeOfJoe

fun gradeFeature() {
//for second use case, we can add a certain feature that can help the teacher
//to input grades on the students subject
//for a single semester.
//Since the subjects are fixed in a single semester, we can then use the Array technology.
    println("--------------------========WELCOME TO KODEGO ACADEMY========--------------------")
    println("The following list are the subjects of Students enrolled in this 1stSemester 2023")
    val subjects: Array<String> = arrayOf(
        "Biology",
        "History",
        "Engineering Drawing",
        "P.E",
        "Trigonometry",
        "Algebra",
        "Differential Calculus"
    )
    for (i in subjects)
        println(i)

    val studentList = ArrayList<String>()
    studentList.add("Joe")
    studentList.add("Bert")
    studentList.add("Alex")
    studentList.add("Ana")
fun decideList() {
    println("Type List to see the list of students enrolled in this 1stSemester 2023")
    if (readln() == "List") {
        println("Below are the list of students")
        for (i in studentList)
            println(i)
    } else {
        println("Wrong key word. Please type List")
        return (decideList())
    }
}
    decideList()
    inputGradeOf()
}

fun inputGradeOf() {
    println("Type the name of the student you want to input Grade: ")
    when (readln()) {
        "Joe" -> {
            gradeOfJoe()
        }
        "Bert" -> {
            gradeOfBert()
        }
        "Alex" -> {
            gradeOfAlex()
        }
        "Ana" -> {
            gradeOfAna()
        }
        else -> {
            println("Name did not belong to the list of students")
            return(inputGradeOf())
        }
    }
}
