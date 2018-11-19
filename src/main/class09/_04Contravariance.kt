package main.class09

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0)
    val y: Comparable<Double> = x // OK!
}

fun main(args: Array<String>) {
// nothing
}

