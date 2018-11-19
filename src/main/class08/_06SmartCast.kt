package main.class08

open class AnotherPerson {

}

class Employee: AnotherPerson() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: AnotherPerson() {

}

fun hasVacations(obj: AnotherPerson){
    if (obj is Employee) {
        obj.vacationDays(20) // Java에선 명시적으로 타입 캐스트 해야하지만 코틀린은 스마트 캐스트 기능이 있다.
    }
}

//val input: Any = "" val 은 이뮤터블이고, 문자열을 assign 했기 때문에 스마트 캐스트 된다.
val input: Any = 10

fun main(args: Array<String>) {
//  이뮤터블 스마트 캐스트
//    if (input is String) {
//        input.length
//    }

//    java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//    val str = input as String
//    println(str.length)

    val str2 = input as? String
    println(str2?.length)

}