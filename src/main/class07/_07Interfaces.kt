package main.class07

interface Interface1 {
    fun funtionA() {
        println("Fun A from Interface 1")
    }
}

interface Interface2 {
    fun funtionA() {
        println("Fun A from Interface 2")
    }
}

class Class1And2: Interface1, Interface2 {
    override fun funtionA() {
        super<Interface2>.funtionA()
    }

}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.funtionA()

}





