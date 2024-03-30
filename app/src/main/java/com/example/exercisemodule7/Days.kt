package com.example.exercisemodule7

//ATIVIDADE 4

class Days {
}

object UtilityHelper2 {
    private var currentDay: CurrentDay = CurrentDay.MONDAY

    fun setCurrentDay(day: CurrentDay){
        currentDay = day

    }

    fun isWeekend(): Boolean{
        return currentDay == CurrentDay.SATURDAY || currentDay == CurrentDay.SUNDAY
    }

}

fun main(){
    println("${UtilityHelper2.isWeekend()}")
    UtilityHelper2.setCurrentDay(CurrentDay.SUNDAY) //alterando o dia atual para domingo
    println("${UtilityHelper2.isWeekend()}")



}
