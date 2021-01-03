package com.example.navegacionactivities

import java.io.Serializable

class PersonForm(email:String): Serializable{
    var email: String = ""
    var firstName: String =""
    var lastName: String = ""
    var surname: String = ""

    init {
        this.email = email
    }

    constructor(email:String,firstName:String):this(email){
        this.firstName = firstName
    }

    constructor(email:String,firstName:String, lastName:String, surname:String):this(email ){
        this.firstName = firstName
        this.lastName = lastName
        this.surname = surname
    }

    fun generaCodigo():String{
        return this.firstName.get(0).toString()+this.lastName.get(0).toString()+this.surname.get(0).toString()+(10000..99999).shuffled().first()
    }
}

