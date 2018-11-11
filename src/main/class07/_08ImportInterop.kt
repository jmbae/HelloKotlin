package main.class07

import main.class07.util.SomeUtilClass
import main.class07.util.somethingPrint as someAnotherNameFunction

fun main(args: Array<String>) {
    SomeUtilClass.printSomeThing()
    someAnotherNameFunction("print this.")
}