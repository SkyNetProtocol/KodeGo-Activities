package com.example.activity4b.classes

class Books (val bookTitle: String, val bookAuthor:String, val yearPublishedBook: Int,
             val bookEdition: String, val bookISBN: Int, val bookPublisher: String)

{
// can be used to select chapter of the book
// can be used to expand the app for more features
// unused as of now
    fun chapter(){
        val listChapter = ArrayList<String>()
        listChapter.add("Chapter1")
        listChapter.add("Chapter2")
        listChapter.add("Chapter3")
        listChapter.add("Chapter4")
        listChapter.add("Chapter5")
        listChapter.add("Chapter6")
    }
    // can be used to select pages of the book
// can be used to expand the app for more features
    // unused as of now
    fun pages(){

        val listPages = ArrayList<Int>()
        listPages.add(1)
        listPages.add(2)
        listPages.add(3)
        listPages.add(4)
        listPages.add(5)
        listPages.add(6)
        listPages.add(7)

    }


}