package main.class09

open class Person
class Employee: Person()

fun operate(person: List<Person>) {

}

fun invariant() {
    val elements: MutableList<Any>
    val strings: MutableList<String> = mutableListOf("A", "B", "C")

    // The line below won't compile
    //  elements = strings
}

fun main(args: Array<String>) {

    operate(listOf<Employee>())
    operate(listOf<Person>())


}
