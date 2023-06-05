package com.example.testingapp.students

fun gradeOfAlex(){
    println("What is the grade of Alex in Biology")
    val strAlex1 = readln()

    println("What is the grade of Alex in History")
    val strAlex2 = readln()

    println("What is the grade of Alex in Engineering Drawing")
    val strAlex3 = readln()

    println("What is the grade of Alex in P.E")
    val strAlex4 = readln()

    println("What is the grade of Alex in Trigonometry")
    val strAlex5 = readln()

    println("What is the grade of Alex in Algebra")
    val strAlex6 = readln()

    println("What is the grade of Alex in Differential Calculus")
    val strAlex7 = readln()

    val gradeAlex = arrayOf(strAlex1,strAlex2,strAlex3,strAlex4,strAlex5,strAlex6,strAlex7)
    println("Below is the summary of grades for Alex")
    println("Alex's grade for Biology is ${gradeAlex[0]}")
    println("Alex's grade for History is ${gradeAlex[1]}")
    println("Alex's grade for Engineering Drawing is ${gradeAlex[2]}")
    println("Alex's grade for P.E is ${gradeAlex[3]}")
    println("Alex's grade for Trigonometry is ${gradeAlex[4]}")
    println("Alex's grade for Algebra is ${gradeAlex[5]}")
    println("Alex's grade for Differential is ${gradeAlex[6]}")
}