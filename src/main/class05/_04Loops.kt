package main.class05

fun whileLoop() {
    fun condition(i: Int) = i < 10

    var i: Int = 0
    while (condition(i)) {
        println(i)
        i++
    }

    i = 0
    do {
        /*...​*/
        println(i)
        i++
    } while (condition(i))
}


fun forLoop() {
    val list = listOf(1, 2, 3)
    for (element in list) {
        print(element)
    }

    for (i in 1..9) { // including 9
        print(i)
    }

    // excluding 10 (the same as 1..9)
    for (i in 1 until 10) {
        print(i)
    }

    for (i in 9 downTo 1 step 2) {
        print(i)
    }

    for ((index, value) in (1..10).withIndex()) {
        println("the element at $index is $value")
    }
}

fun main(args: Array<String>) {
//    forLoop()
    whileLoop()
}