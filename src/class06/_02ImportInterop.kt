package class06

import class06.util.SomeUtilClass
import class06.util.somethingPrint as someAnotherNameFunction

fun main(args: Array<String>) {
    SomeUtilClass.printSomeThing()
    someAnotherNameFunction("print this.")
}