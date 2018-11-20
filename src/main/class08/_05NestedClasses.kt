package main.class08


class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}

class OuterWithInner {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = 2
    }
}


fun main(args: Array<String>) {
    val outer = Outer.Nested().foo() // == 2
    println(outer)
    val outerWithInner = OuterWithInner().Inner().foo() // == 1
    println(outerWithInner)
}