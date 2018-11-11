package main.class10

fun main(args: Array<String>) {
    val message: String = "Message"

    var nullMessage: String? = null
    val inferredNull = null

    println(nullMessage?.length)

//    println(nullMessage!!.length)

//    nullMessage = "Some value"
//    println(nullMessage.length)
}

