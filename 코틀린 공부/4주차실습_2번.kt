// Scope 함수 연습
// Person 객체를 만들고 속성을 지정하는 createPersonWith와 createPersonApply를 만드시오.
// 단, createPersonWith는 with scope 함수를 반드시 사용하고 createPersonApply는 apply 함수를 반드시 사용할 것.

class Person() {
    var name: String? = null
    var age: Int? = null
    var email: String? = null
    override fun toString() = "$name, $age, $email"
}

fun createPersonWith(_name: String, _age: Int, _email: String? = null): Person {
    // TODO: implement function
    val str = with(Person()){
        name = _name
        age = _age
        email = _email
        this
    }
    return str
}
fun createPersonApply(_name: String, _age: Int, _email: String? = null): Person {
    // TODO: implement function
    val str2 = Person().apply{
        name = _name
        age = _age
        email = _email
    }
    return str2
}

fun main() {
    val person1 = createPersonWith("Alice", 30)
    println(person1) // expected output: Alice, 30, null
    val person2 = createPersonApply("Bob", 25, "bob@example.com")
    println(person2) // expected output: Bob, 25, bob@example.com
}
