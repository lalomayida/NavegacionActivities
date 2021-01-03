package com.example.navegacionactivities

fun main (){
    var name:String = "Luis Eduardo Mayida"
    var nameNullable:String? = null
    //nameNullable = null

    var len2:Int? = name?.length
    name = nameNullable ?: "Guest"

    println(name)
    println(len2)
}