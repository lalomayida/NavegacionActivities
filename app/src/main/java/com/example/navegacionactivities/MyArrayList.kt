package com.example.navegacionactivities

fun main(){
    val myArray = ArrayList<String>()
    myArray.add("Element1")
    myArray.add("Element2")

    for(i in myArray){
        println(i)
    }

    var itr = myArray.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }

    println(myArray.get(1))
    println("Size: "+myArray.size)

    val myArray2 = ArrayList<String>()
    myArray2.add("Element1")
    myArray2.add("Element2")
    myArray2.add("Element3")
    myArray2.add("Element4")
    myArray2.add("Element5")
    myArray2.add("Element6")
    myArray2.add("Element7")

    for(i in myArray2){
        println(i)
    }

    println(myArray2.get(5))
    println("Size: "+myArray2.size)
}