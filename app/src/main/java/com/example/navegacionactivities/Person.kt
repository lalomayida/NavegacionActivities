package com.example.navegacionactivities

fun main (){
    var nicky:Person = Person("Nickys", "TRiquies")
    nicky.hobby = "View Movies"
    nicky.stateHobby()

    var doggy:Person = Person()
    doggy.hobby = "Play futbol"
    doggy.stateHobby()

    var destrozoggy: Person = Person(lastName = "Destrozoggy")
    destrozoggy.hobby = "to chew shoes"
    destrozoggy.stateHobby()
}

class Person(firstName:String="Jon Von", lastName:String="Doggy"){
    var age:Int? = null
    var hobby:String="Play Tennis"

    init {
        println("Objeto creado "+firstName+" "+lastName)
    }

    constructor(firstName: String, lastName: String, age:Int): this(firstName, lastName){
        this.age = age
    }

    fun stateHobby(){
        println("My hobby is $hobby")
    }
}