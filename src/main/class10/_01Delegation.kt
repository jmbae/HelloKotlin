package main.class10

import main.class07.Customer
import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef 에 할당된 Example 객체는 '${property.name}'를 Delegate 클래스에 위임했습니다."
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("Example 클래스가 생성되어 ${thisRef}에 할당되고, $value 타입의 객체가 멤버변수 '${property.name}'에 할당되었습니다.")
    }
}

fun main(args: Array<String>) {
    val example = Example()
    example.p = "String"
    println(example.p)


    //다른 어딘가에서
    val repository = RepositoryImpl()
    val logger = LoggerImpl()

    val controller = Controller(repository, logger)

    controller.getAll()
    controller.logAll()
}

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {

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
