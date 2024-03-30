package com.example.exercisemodule7

//ATIVIDADE 1

class StringList {

}

fun main(){
    println("casa".stringList())
}

fun String.stringList(): MutableList<String>{
    val casa = this
    val list = mutableListOf<String>()

    for (letter in casa) {
        list.add(letter.toString())
    }
    return list
}
