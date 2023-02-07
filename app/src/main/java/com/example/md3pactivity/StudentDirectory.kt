package com.example.md3pactivity

fun main() {
    println("Student Directory")

//List of student progress
    val john = 5
    val emannuel = 20
    val junzon = 40
    val noven = 10
    val andrew = 15
    val alexander = 17
    val andrei = 20
    val dadz = 15
    val marie = 5
    val gretchen = 7
    val hanz = 12
    val jeffrey = 13
    val jerome = 10
    val laurence = 12
    val rey = 13
    val riz = 15
    val ryan = 17

//List of Students
    val student1 = "John"
    val student2 = "Emannuel"
    val student3 = "Junzon"
    val student4 = "Noven"
    val student5 = "Andrew"
    val student6 = "Alexander"
    val student7 = "Andrei"
    val student8 = "Dadz"
    val student9 = "Marie"
    val student10 = "Gretchen"
    val student11 = "Hanz"
    val student12 = "Jeffrey"
    val student13 = "Jerome"
    val student14 = "Laurence"
    val student15 = "Rey"
    val student16 = "Riz"
    val student17 = "Ryan"

    println("Please fill up the following to know the status of the class")
    var stringValue = ""
    println("Is Sir loy Present, Absent or Late? Enter value : ")

    stringValue = readln()

    when (stringValue.lowercase()) {
        "absent" -> {
            println("Class is suspended") }
        "present" -> {
            println("Class will proceed accordingly") }
        "late" -> {
            println("Class will start at some point in the schedule")}
        else -> {
            return(main())
        }
    }

    println("Please fill up the following to know the progress of the students")
    var stringValue2 = ""
    println("Type list to see the list of students : ")
    stringValue2 = readln()

    when (stringValue2.lowercase()) {
        "list" -> {
            println(student1)
            println(student2)
            println(student3)
            println(student4)
            println(student5)
            println(student6)
            println(student7)
            println(student8)
            println(student9)
            println(student10)
            println(student11)
            println(student12)
            println(student13)
            println(student14)
            println(student15)
            println(student16)
            println(student17)}
        else -> {
            return(main())
        }
    }

    println("Which of the following students you want to know the progress in the class")
    var stringValue3 = ""
    println("Type list to see the list of students : ")
    stringValue3 = readln()
    when (stringValue3.lowercase()) {
        "john" -> {
            println("student progress in percentage is $john") }
        "emannuel" -> {
            println("student progress in percentage is $emannuel") }
        "junzon" -> {
            println("student progress in percentage is $junzon")}
        "noven" -> {
            println("student progress in percentage is $noven")}
        "andrew" -> {
            println("student progress in percentage is $andrew")}
        "alexander" -> {
            println("student progress in percentage is $alexander")}
        "andrei" -> {
            println("student progress in percentage is $andrei")}
        "dadz" -> {
            println("student progress in percentage is $dadz")}
        "marie" -> {
            println("student progress in percentage is $marie")}
        "gretchen" -> {
            println("student progress in percentage is $gretchen")}
        "hanz" -> {
            println("student progress in percentage is $hanz")}
        "jeffrey" -> {
            println("student progress in percentage is $jeffrey")}
        "jerome" -> {
            println("student progress in percentage is $jerome")}
        "laurence" -> {
            println("student progress in percentage is $laurence")}
        "rey" -> {
            println("student progress in percentage is $rey")}
        "riz" -> {
            println("student progress in percentage is $riz")}
        "ryan" -> {
            println("student progress in percentage is $ryan")}
        else -> {
            return(main())
        }
    }
}

//You are tasked to create a directory of the students taking this course.
//The data will be used to send updates regarding the classes.
//There is also a need to know the progress of the students during the progress of this course.
//List down all data that can be used to implement this. Use the proper data types.
//send to md3p-activity-01a