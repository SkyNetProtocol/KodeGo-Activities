package com.example.testingapp.students

fun gradeOfAna(){
    println("What is the grade of Ana in Biology")
    val strAna1 = readln()

    println("What is the grade of Ana in History")
    val strAna2 = readln()

    println("What is the grade of Ana in Engineering Drawing")
    val strAna3 = readln()

    println("What is the grade of Ana in P.E")
    val strAna4 = readln()

    println("What is the grade of Ana in Trigonometry")
    val strAna5 = readln()

    println("What is the grade of Ana in Algebra")
    val strAna6 = readln()

    println("What is the grade of Ana in Differential Calculus")
    val strAna7 = readln()

    val gradeAna = arrayOf(strAna1,strAna2,strAna3,strAna4,strAna5,strAna6,strAna7)
    println("Below is the summary of grades for Ana")
    println("Ana's grade for Biology is ${gradeAna[0]}")
    println("Ana's grade for History is ${gradeAna[1]}")
    println("Ana's grade for Engineering Drawing is ${gradeAna[2]}")
    println("Ana's grade for P.E is ${gradeAna[3]}")
    println("Ana's grade for Trigonometry is ${gradeAna[4]}")
    println("Ana's grade for Algebra is ${gradeAna[5]}")
    println("Ana's grade for Differential is ${gradeAna[6]}")
}