package main.class09

interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    var objects: Source<Any> = strs
}

fun main(args: Array<String>) {
// nothing
}