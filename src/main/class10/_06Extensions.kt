//@file:JvmName("StringUtil")
package main.class10

fun String.lastChar() = this.get(this.length - 1)

// 'this' can be omitted
fun String.lastChar1() = get(length - 1)

fun test() {
    // visible in completion
    "abc".lastChar()
}

// Infix
infix fun String.isEqual(value: String) = this == value

// Extention
private fun String.endsWith() {
    this + "with End"
}
fun main(args: Array<String>) {
    "A Message".endsWith()
    "A Message" isEqual "message"
}
