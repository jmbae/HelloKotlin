package main.class06

fun foo(fooParam: String) {
    val outerFunction = "Value"
    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
}

fun main(args: Array<String>) {
    foo("Some value")
}
