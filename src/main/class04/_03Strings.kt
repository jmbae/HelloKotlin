package class04

fun main(args: Array<String>) {
    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new linke \n"

    val rawString = "Hello" +
            "This is second line" +
            "A third line"

    val multipleLines = """
             This is a string
            And this is another line
            """

    val years = 10
    val message = "A decade is $years years"

    // String template
    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"
}