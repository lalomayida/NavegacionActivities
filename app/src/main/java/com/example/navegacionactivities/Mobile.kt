package com.example.navegacionactivities

fun main (){
    var nicky:Mobile = Mobile("Android","Samsung","Motorola")
    var doggy:Mobile = Mobile()
    var destrozoggy: Mobile = Mobile(model = "Samsung Galaxy 4")
}
class Mobile(os:String="Android", brand:String="Samsung", model:String="Base Model"){
    init {
        println("Objeto creado "+os+" "+brand+" "+model)
    }
}