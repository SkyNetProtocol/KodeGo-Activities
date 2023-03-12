package com.example.activityd.classes

import kotlin.collections.ArrayList

fun main() {
// extra variables
        //accessing parent class
        val audio1 = AudioAndVideoRecordingDetails("15min","May 25, 2005",
                "Exercise Activity","OBS publishing")
        //accessing class inside a parent class file
        val recordingAudio1 = AudioAndVideoRecordingDetails.AudioAndVideoRecordingStatus("Yes",
                "N/A","Video Only")
// variables for publisher
        val publisher3 = PublisherDetails("Marvel comics","007 St. Texas United States",
                "January 2, 2005")
        val publisher4 = PublisherDetails("Wall Street Journal","55 St. N.Y city United States",
                "March 13, 1976")
        val publisher5 = PublisherDetails("INQUIRER","99 St. Brgy.Tali Pasig Philippines",
                "November 28, 1992")
        val publisher6 = PublisherDetails("DC comics","51 St. Chicago United States",
                "April 17, 1998")
// variables for magazine/newspaper/comics
        val illustrator1 = ComicsDetails.ComicsIllustrator("Harold","Truman",
        "George","November 25, 1979")
        val illustrator2 = ComicsDetails.ComicsIllustrator("Dwight","Paul",
                "Hunks","November 25, 1979")
        val mag1 = MagazineDetails("R.C John", "Architecture in the future", "October", 2001)
        val mag2 = MagazineDetails("J.B Roberts", "Sports Digest", "November", 1992)
        val newspaper1 = NewspaperDetails(
                publisher4.publisherName, "monday", "January",
                2007, "FacebookStockBreakdown"
        )
        val newspaper2 = NewspaperDetails(
                publisher5.publisherName, "Friday", "February",
                2011, "Philippine Politics Overview"
        )
        val comics1 = ComicsDetails(
                "Batman", "June", 1994,
                illustrator1.firstNameComicIllustrator + illustrator1.middleNameComicIllustrator
                + illustrator1.lastNameComicIllustrator, publisher6.publisherName
        )
        val comics2 = ComicsDetails(
                "Iron Man", "July", 2001,
                illustrator2.firstNameComicIllustrator + illustrator2.middleNameComicIllustrator
                        + illustrator2.lastNameComicIllustrator, publisher3.publisherName
        )
// variables for book/Author
        val authorBook1 = AuthorsDetails("Shepherd","William", "Cowell", "March 18, 1990")
        val authorBook2 = AuthorsDetails("Robert","Wise", "James", "April 2, 1988")

        val book1 = Books("Trigonometry",authorBook1.firstName + authorBook1.middleName + authorBook1.lastName,2015,"4th edition",
        1231237,"JC Publishing")
        val book2 = Books("Algebra",authorBook2.firstName + authorBook2.middleName + authorBook2.lastName,2016,"1st edition",
                1431439,"Gray Publishing")

        // Arraylist for magazine, newspaper, comics
        val titleList = ArrayList<String>()
        titleList.add("Magazine[1] " + mag1.titleMag)
        titleList.add("Magazine[2] " + mag2.titleMag)
        titleList.add("Newspaper[1] " + newspaper1.nameNewsPaper)
        titleList.add("Newspaper[2] " + newspaper2.nameNewsPaper)
        titleList.add("Comics[1] " + comics1.titleComics)
        titleList.add("Comics[2] " + comics2.titleComics)

// Arraylist for all items in readers catalog with authors
        val allItemInCatalog = ArrayList<String>()
        allItemInCatalog.add("Magazine[1] " + mag1.titleMag + " which is edited by " + mag1.editorMag)
        allItemInCatalog.add("Magazine[2] " + mag2.titleMag + " which is edited by " + mag2.editorMag)
        allItemInCatalog.add("Newspaper[1] " + newspaper1.nameNewsPaper + " which is published by " + newspaper1.nameNewsPaper)
        allItemInCatalog.add("Newspaper[2] " + newspaper2.nameNewsPaper + " which is published by " + newspaper2.nameNewsPaper)
        allItemInCatalog.add("Comics[1] " + comics1.titleComics + " which is illustrated by " + comics1.illustratorComics)
        allItemInCatalog.add("Comics[2] " + comics2.titleComics + " which is illustrated by " + comics2.illustratorComics)
        allItemInCatalog.add("Book[1] " + book1.bookTitle + " which is authored by " + book1.bookAuthor)
        allItemInCatalog.add("Book[2] " + book2.bookTitle + " which is authored by " + book2.bookAuthor)
//use filter
        fun titleSearch() {
                println("Please select the category name of magazine,newspaper or comics you want to read. Example type Magazine[1]:")
                when(readln()){
                        "Magazine[1]"-> {
                                val filter1 = titleList.filter { it == "Magazine[1] " + mag1.titleMag }
                                println("You have selected")
                                println(filter1)
                                println("Enjoy reading")
                        }
                        "Magazine[2]" -> {
                                val filter2 = titleList.filter { it == "Magazine[2] " + mag2.titleMag }
                                println("You have selected")
                                println(filter2)
                                println("Enjoy reading")
                        }
                        "Newspaper[1]" -> {
                                val filter3 = titleList.filter { it == "Newspaper[1] " + newspaper1.nameNewsPaper }
                                println("You have selected")
                                println(filter3)
                                println("Enjoy reading")
                        }
                        "Newspaper[2]" -> {
                                val filter4 = titleList.filter { it == "Newspaper[2] " + newspaper2.nameNewsPaper }
                                println("You have selected")
                                println(filter4)
                                println("Enjoy reading")
                        }
                        "Comics[1]" -> {
                                val filter5 = titleList.filter { it == "Comics[1] " + comics1.titleComics }
                                println("You have selected")
                                println(filter5)
                                println("Enjoy reading")
                        }
                        "Comics[2]" -> {
                                val filter6 = titleList.filter { it == "Comics[1] " + comics1.titleComics }
                                println("You have selected")
                                println(filter6)
                                println("Enjoy reading")
                        }
                        else -> {
                                println("The category you have search does not belong to the search catalog")
                                return titleSearch()
                        }
                }
                println("Type Home to start again")
                println("Type Exit to end")
                if (readln() == "Home"){
                        return main()
                }else{
                        println("You will now exit KODEGO READERS CATALOG")
                }
        }
        // use different approach other than filter
        fun wholeCatalog() {
                println("Please select the category name of the item you want to read. Example type Magazine[1]:")
                when(readln()){
                        "Magazine[1]"-> {
                                println("You have selected")
                                println("Magazine[1] " + mag1.titleMag)
                                println("Enjoy reading")
                        }
                        "Magazine[2]" -> {
                                println("You have selected")
                                println("Magazine[2] " + mag2.titleMag)
                                println("Enjoy reading")
                        }
                        "Newspaper[1]" -> {
                                println("You have selected")
                                println("Newspaper[1] " + newspaper1.nameNewsPaper)
                                println("Enjoy reading")
                        }
                        "Newspaper[2]" -> {
                                println("You have selected")
                                println("Newspaper[2] " + newspaper2.nameNewsPaper)
                                println("Enjoy reading")
                        }
                        "Comics[1]" -> {
                                println("You have selected")
                                println("Comics[1] " + comics1.titleComics)
                                println("Enjoy reading")
                        }
                        "Comics[2]" -> {
                                println("You have selected")
                                println("Comics[2] " + comics2.titleComics)
                                println("Enjoy reading")
                        }
                        "Book[1]" -> {
                                println("You have selected")
                                println("Book[1] " + book1.bookTitle)
                                println("Enjoy reading")
                        }
                        "Book[2]" -> {
                                println("You have selected")
                                println("Book[2] " + book2.bookTitle)
                                println("Enjoy reading")
                        }
                        else -> {
                                println("The category you have search does not belong to the search catalog")
                                return wholeCatalog()
                        }
                }
                println("Type Home to start again")
                println("Type Exit to end")
                if (readln() == "Home"){
                        return main()
                }else{
                        println("You will now exit KODEGO READERS CATALOG")
                }
        }
        fun decide() {
                println("Type A for the list of magazine, newspaper and comics")
                println("Type B for the list of all items in the catalog")
                when (readln()) {
                    "A" -> {
                            println("The following list are the list of magazine, newspaper and comics")
                            for (a in titleList)
                            println(a)
                            println(titleSearch())
                    }
                    "B" -> {
                            println("The following list are the list of all items in catalog with authors")
                            for (i in allItemInCatalog)
                            println(i)
                            println(wholeCatalog())
                    }
                    else -> {
                            println("You did not type the correct key word")
                            println("Press follow instruction")
                            return (decide())
                    }
                }
        }
        println("===========================WELCOME TO KODEGO READERS CATALOG============================")
        println("===============WHEREIN YOU CAN FIND MAGAZINE, NEWSPAPER, COMICS AND BOOKS===============")
        println("                                                                                        ")
        println(decide())
}
