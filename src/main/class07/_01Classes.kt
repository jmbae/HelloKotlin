package main.class07

// similar to javaCode.Person

class AnotherPerson(val name: String, val age: Int) {
    fun hello() {
        println("Hello $name!")
    }
}

fun main(args: Array<String>) {
    // no new keyword, constructor is called as a regular function
    val person = AnotherPerson("Alice", 26)
    println(person.name)
    person.hello()
}