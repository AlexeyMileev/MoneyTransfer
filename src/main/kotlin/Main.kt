package ru.netology

val amount = 1_000
val comission = (0.75 / 100)
val minComission  = 35.0

fun main() {
    var transferComission = amount * comission
    if (transferComission <= minComission) transferComission = minComission
    println("При переводе суммы $amount руб. комиссия составит $transferComission  руб.")

}
