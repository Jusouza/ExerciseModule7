package com.example.exercisemodule7

//ATIVIDADE 2
enum class DayOfWeek(val translate: String) {
    SEGUNDA("monday"),
    TERCA("tuesday"),
    QUARTA("wednesday"),
    QUINTA("thursday"),
    SEXTA("friday"),
    SABADO("saturday"),
    DOMINGO("sunday");
}

fun main(){
    println("${DayOfWeek.valueOf("DOMINGO").translate}")
}
