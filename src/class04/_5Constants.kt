package class04

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c

val CopyrightName = "JetBrains"

// known at compile time
const val CopyrightYear = 2017

val a = sum(2, 3)

fun main(args: Array<String>) {
    println(a)
}