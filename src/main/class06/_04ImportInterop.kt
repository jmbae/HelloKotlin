package main.class06

import main.class06.util.SomeUtilClass
import main.class06.util.somethingPrint as someAnotherNameFunction

fun main(args: Array<String>) {
    SomeUtilClass.printSomeThing()
    someAnotherNameFunction("print this.")
}