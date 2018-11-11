package main.class06

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun unaryOperation(x: Int, op: (Int) -> Int) {
    op(x)
}

fun unaryOp(op: (Int) -> Int ) {

}
fun sum(x: Int, y: Int) = x + y


fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun main(args: Array<String>) {

    println(operation(1, 2, ::sum))

    val sumLamda: (Int, Int) -> Int = { x, y -> x + y }


    operation(1, 2, sumLamda)

    unaryOperation(2, { x -> x * x })

    unaryOperation(3, { it * it })

    unaryOperation(3) { it * it }

    unaryOp {
        it * it
    }


    val db = Database()

    transaction(db) {
        // interact with database

    }

    unaryOperation(3, fun(x: Int): Int { return x * x })

}