package main.class05

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
// c in 'a'..'z'
// is compiled to:
// 'a' <= c && c <= 'z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know…​"
}

fun main(args: Array<String>) {
    println(isLetter('q'))     // true
    println(isNotDigit('x'))   // true

    println(recognize('0'))
    println(recognize('a'))
    println(recognize('가'))
}