package com.example.exercisemodule7

//ATIVIDADE 3
 enum class CurrentDay() {
    SUNDAY,
    SATURDAY,
    FRIDAY,
    THURSDAY,
    WEDNESDAY,
    TUESDAY,
    MONDAY;
}

object UtilityHelper {
    private var currentDay: CurrentDay = CurrentDay.SUNDAY

    fun setCurrentDay(day: CurrentDay){
        currentDay = day
    }

    fun isWeekend(): Boolean{
        return currentDay == CurrentDay.SATURDAY || currentDay == CurrentDay.SUNDAY
    }

}

fun main(){
    println("É fim de semana? ${UtilityHelper.isWeekend()}") // Deveria imprimir true se for sábado ou domingo
    UtilityHelper.setCurrentDay(CurrentDay.MONDAY) // Mudando para segunda-feira
    println("É fim de semana agora? ${UtilityHelper.isWeekend()}") // Deveria imprimir false porque é segunda-feira
}