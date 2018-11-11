package main.class08


fun main(args: Array<String>) {
    val (country, city) = Pair("Spain", "Madrid")

    val (country1, city1, continent1) = Triple("Spain", "Madrid", "Europe")

    val (_, age) = Person("Joe Smith", 42)

    val person = Person("Joe Smith", 42)

    println(person.component1())
}