package main.class09
import main.class06.Customer

interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

class ReadOnlyRepoImpl<T> :ReadOnlyRepo<T> {
    override fun getId(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {

    val ro = ReadOnlyRepoImpl<Customer>()

    ro.getAll()

}
