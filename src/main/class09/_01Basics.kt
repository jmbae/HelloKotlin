package main.class09

class Stack<E>(private vararg val items: E) {
    private val elements = items.reversed().toMutableList()

    fun push(element: E) {
        elements.add(0, element)
    }

    fun pop(): E? {
        if (!isEmpty())
            return elements.removeAt(0)
        return null
    }

    private fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun main(args: Array<String>) {
    val stack = Stack(1,2,3,4)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stack2 = Stack("가","나","다","라")
    stack2.push("바")
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
}