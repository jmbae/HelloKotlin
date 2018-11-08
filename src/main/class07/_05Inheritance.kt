package class07

open class Person { // 클래스 선언부 괄호는 파라미터가 없을 경우 생략할 수 있다.
    open fun validate() {

    }
}

open class Customer: Person {
    final override fun validate() {

    }

    constructor(): super() {
        // 클래스 이름 옆 괄호 대신에 커스텀 블럭을 선언하여 클래스 만들 컨스트럭터를 만들 수 있다.
        // 컨스트럭터가 왜 다른 함수랑 다르냐면, 다른 함수는 메모리 할당시에 선언되는데,
        // 컨스트럭터는 메모리 할당 전에 명령문을 실행해야하는 블럭이기 때문에 별도로 존재한다.

    }

}

class SpecialCustomer: Customer() {
//    override fun validate() { 파이널이라서 오버라이드 더이상 안됨
//
//    }
}

data class CustomerEntity(val name: String): Person()

fun main(args: Array<String>) {

    val customer = Customer()

    customer.validate()

    val specialCustomer = SpecialCustomer()

    specialCustomer.validate()


}