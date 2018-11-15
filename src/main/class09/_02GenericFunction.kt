package main.class09

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements) // * operator 스프레드 오퍼레이터:
}

fun main(args: Array<String>) {
    val stack2 = stackOf("가","나","다","라")
    stack2.push("바")
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
}