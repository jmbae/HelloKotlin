package main.class07


abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return "status: " + isActive.toString()
    }

}

class Employee : StoredEntity() {
    override fun store() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


fun main(args: Array<String>) {
    val se = Employee()
    println(se.isActive)
    println(se.status())
    se.store()
}