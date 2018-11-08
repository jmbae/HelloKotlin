package main.class07


interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {


}

fun main(args: Array<String>) {
    //다른 어딘가에서
    val repository = RepositoryImpl()
    val logger = LoggerImpl()

    val controller = Controller(repository, logger)

    controller.getAll()
    controller.logAll()
}

class RepositoryImpl: Repository {
    override fun getById(id: Int): Customer {
        println("call getById: $id Repository")
        return Customer()
    }

    override fun getAll(): List<Customer> {
        val customer1 = Customer()
        val customer2 = Customer()
        val customer3 = Customer()
        println("getAll 리스트를 출력합니다. $customer1")
        return listOf(customer1, customer2, customer3)
    }

}

class LoggerImpl: Logger {
    override fun logAll() {
        println("로그를 찍습니다.")
    }

}

