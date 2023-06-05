package com.example.testingapp.usecases

// first useCase attendance app
// Since Student population is not fixed and needs to be scalable, we can use the Arraylist technology to
// build a scalable feature. This feature can help teachers monitor the attendance of each students
// for complete integration/future improvement: we can then use a database to store the values of student names and student status
fun main(){
    val studentList = ArrayList<String>()
    studentList.add("Joe")
    studentList.add("Bert")
    studentList.add("Alex")
    studentList.add("Ana")

    println("The following are the list of students in KODEGO")
    for (i in studentList)
        println(i)

    println("Please type the attendance status of the students. Note: Accepted status are Present, Absent and Late")
    println("What is the attendance status of ${studentList[0]}")
    fun decide1() {
        when (val string1 = readln()) {
            "Present" -> {
                println("${studentList[0]} is: $string1")
            }
            "Absent" -> {
                println("${studentList[0]} is: $string1")
            }
            "Late" -> {
                println("${studentList[0]} is: $string1")
            }
            else -> {
                println("You did not type the correct key word")
                println("What is the attendance status of ${studentList[0]}")
                return (decide1())
            }
        }
    }
    (decide1())

    println("What is the attendance status of ${studentList[1]}")
    fun decide2() {
        when (val string2 = readln()) {
            "Present" -> {
                println("${studentList[1]} is: $string2")
            }
            "Absent" -> {
                println("${studentList[1]} is: $string2")
            }
            "Late" -> {
                println("${studentList[1]} is: $string2")
            }
            else -> {
                println("You did not type the correct key word")
                println("What is the attendance status of ${studentList[1]}")
                return (decide2())
            }
        }
    }
    (decide2())

    println("What is the attendance status of ${studentList[2]}")
    fun decide3() {
        when (val string3 = readln()) {
            "Present" -> {
                println("${studentList[2]} is: $string3")
            }
            "Absent" -> {
                println("${studentList[2]} is: $string3")
            }
            "Late" -> {
                println("${studentList[2]} is: $string3")
            }
            else -> {
                println("You did not type the correct key word")
                println("What is the attendance status of ${studentList[2]}")
                return (decide3())
            }
        }
    }
    (decide3())

    println("What is the attendance status of ${studentList[3]}")
    fun decide4() {
        when (val string1 = readln()) {
            "Present" -> {
                println("${studentList[3]} is: $string1")
            }
            "Absent" -> {
                println("${studentList[3]} is: $string1")
            }
            "Late" -> {
                println("${studentList[3]} is: $string1")
            }
            else -> {
                println("You did not type the correct key word")
                println("What is the attendance status of ${studentList[3]}")
                return (decide4())
            }
        }
    }
    (decide4())
    //FeatureOptionSection
    println("Type A to proceed with grade feature. Note: This feature lets the Teacher to input student grade")
    println("Type B to proceed with seat number feature. Note: This feature lets the Teacher to assign seat number for students")

    fun decideToNext() {
        when (readln()) {
            "A" -> {
                gradeFeature()
            }
            "Stay" -> {
                return main()
            }
            else-> {
                println("You did not type the correct key word")
                println("Please type A, B or C")
                return decideToNext()
            }
        }
    }
    decideToNext()

}


