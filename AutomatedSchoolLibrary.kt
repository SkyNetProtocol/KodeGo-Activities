package com.example.md3pactivity2

fun main() {
    println("Welcome to Kodego Automated School Library")

//Items that can be borrowed in the Library
    val mathBook1 = "Advance Math"
    val mathBook2 = "Trigonometry"
    val mathBook3 = "Differential Calculus"
    val mathBook4 = "Integral Calculus"
    val mathBook5 = "Differential Equations"
    val mathBook6 = "Probability and Statistics"
    val scienceBook1 = "Biology"
    val scienceBook2 = "Anatomy"
    val scienceBook3 = "Zoology"
    val scienceBook4 = "Botany"
    val historyBook1 = "Napoleonic Wars"
    val historyBook2 = "Ancient Civilization"
    val historyBook3 = "Aztecs and Babylonians"
    val historyBook4 = "World War 1 history"
    val historyBook5 = "Philippine History"
    val mangaBook1 = "Naruto Shippuden"
    val mangaBook2 = "Attack on Titan Book1"
    val mangaBook3 = "One Punch Man"

//Characteristics of books
    val char1 = "OLD"
    val char2 = "New"
    val char3 = "International Author"
    val char4 = "Local Author"
    val char5 = "Math Book"
    val char6 = "Science Book"
    val char7 = "History Book"
    val char8 = "Manga"

//Book pages
    val page1 = 256
    val page2 = 177
    val page3 = 125
    val page4 = 140
    val page5 = 145
    val page6 = 188
    val page7 = 322
    val page8 = 321
    val page9 = 30
    val page10 = 40
    val page11 = 25

    println("Do you want to borrow a Book?")
    var string = ""
    println("Type Yes, No : ")
    string = readln()

    when (string) {
        "Yes" -> {
            println("Type List to see the books that can be borrowed")
        }
        else -> {
            return (main())
        }
    }

    var string2 = ""
    string2 = readln()

    when (string2.lowercase()) {
        "list" -> {
            println(mathBook1)
            println(mathBook2)
            println(mathBook3)
            println(mathBook4)
            println(mathBook5)
            println(mathBook6)
            println(scienceBook1)
            println(scienceBook2)
            println(scienceBook3)
            println(scienceBook4)
            println(historyBook1)
            println(historyBook2)
            println(historyBook3)
            println(historyBook4)
            println(historyBook5)
            println(mangaBook1)
            println(mangaBook2)
            println(mangaBook3)}
        else -> {
            return(main())
        }
    }

    println("Please pick the Book you wanted to borrow : ")
    var string3 = ""
    string3 = readln()

    when (string3) {
        "Advance Math" -> {
            println("You pick an $char1 $char5 with $page1 pages.") }
        "Trigonometry" -> {
            println("You pick a $char2 $char5 with $page2 pages.") }
        "Differential Calculus" -> {
            println("You pick an $char1 $char5 with $page3 pages and created by a $char4.") }
        "Integral Calculus" -> {
            println("You pick a $char2 $char5 with $page4 pages and created by an $char3.") }
        "Differential Equations" -> {
            println("You pick a $char2 $char5 with $page5 pages and created by an $char3.") }
        "Probability and Statistics" -> {
            println("You pick a $char2 $char5 with $page6 pages and created by a $char4.") }
        "Biology" -> {
            println("You pick a $char2 $char6 with $page2 pages and created by a $char4.") }
        "Anatomy" -> {
            println("You pick a $char2 $char6 with $page7 pages and created by a $char4.") }
        "Zoology" -> {
            println("You pick an $char1 $char6 with $page8 pages and created by an $char3.") }
        "Botany" -> {
            println("You pick a $char2 $char6 with $page7 pages and created by an $char3.") }
        "Napoleonic Wars" -> {
            println("You pick an $char1 $char7 with $page3 pages and created by a $char4.") }
        "Ancient Civilization" -> {
            println("You pick an $char1 $char7 with $page5 pages and created by a $char4.") }
        "Aztecs and Babylonians" -> {
            println("You pick a $char2 $char7 with $page4 pages and created by a $char4.") }
        "World War 1 history" -> {
            println("You pick a $char2 $char7 with $page1 pages and created by a $char4.") }
        "Philippine History" -> {
            println("You pick a $char2 $char7 with $page8 pages and created by an $char3.") }
        "Naruto Shippuden" -> {
            println("You pick a $char2 $char8 with $page9 pages and created by an $char3.") }
        "Attack on Titan Book1" -> {
            println("You pick a $char2 $char8 with $page10 pages and created by an $char3.") }
        "One Punch Man" -> {
            println("You pick a $char2 $char8 with $page11 pages and created by an $char3.") }
        else -> {
            return (main())
        }
    }
}

//You are tasked to automate a school’s library.
//Identify the items that can be borrowed in a Library.
//After listing the different items, identify the characteristics of the items.
//Use the proper data types.
//md3p-activity-01b