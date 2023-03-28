// Exercise: Vehicle Inheritance
// 여러 타입의 탈 것의 부모 클래스가 될 Vehicle 클래스를 만든다. Vehicle 클래스를 상속하여 Car, Motorcycle, Bicycle 등을 만들 수 있다.
// Vehicle 클래스는 다음 속성을 갖는다.
// •	make (제조사)
// •	model (모델명)
// •	year (생산년도)
// Vehicle 클래스는 다음 메소드를 갖는다.
// •	start (출발)
// •	stop (정지)
// Car, Motorcyle, Bicycle 클래스를 Vehicle 클래스를 상속하여 만든다.
// Car 클래스는 다음의 추가 속성을 갖는다.
// •	numDoors (차문의 수)
// Motorcycle 클래스는 다음의 추가 속성을 갖는다.
// •	hasSidecar (사이드카를 갖는지 여부를 나타내는 Boolean)
// Bicycle 클래스는 다음의 추가 속성을 갖는다.
// •	numGears (기어 수)
// 각 서브클래스(Car, Motorcycle, Bicycle)는 자신의 start, stop 메소드를 갖는다. 예를 들어 Car의 start는 키를 돌린다, Bicycle의 start는 페달을 밟는다와 같이 만든다. 실제로 이런 내용을 만들 수는 없으니 println으로 해당 동작을 출력하도록 한다.

open class Vehicle(val make: String, val model: String, val year: Int) {
    open fun start() {
        println("출발")
    }

    open fun stop() {
        println("정지")
    }
}

class Car(make: String, model: String, year: Int, val numDoors: Int) : Vehicle(make, model, year) {
    override fun start() {
        println("키 돌리기")
    }

    override fun stop() {
        println("차 정지")
    }

    fun drive() {
        println("차 드라이브")
    }
}

class Motorcycle(make: String, model: String, year: Int, val hasSidecar: Boolean) : Vehicle(make, model, year) {
    override fun start() {
        println("출발")
    }

    override fun stop() {
        println("오토바이 정지")
    }

    fun ride() {
        println("오토바이 탄다")
    }
}

class Bicycle(make: String, model: String, year: Int, val numGears: Int) : Vehicle(make, model, year) {
    override fun start() {
        println("페달 밟는다")
    }

    override fun stop() {
        println("자전거 정지")
    }

    fun ride() {
        println("자전거 탄다")
    }
}
fun list_name(vehicles: List<Vehicle>) {
    for (v in vehicles) {
        println("${v.make} ${v.model} ${v.year}")
    }
}

fun main(){
    
    val car = Car("Honda", "Civic", 2022, 4)
    val motorcycle = Motorcycle("Harley Davidson", "Fat Boy", 2022, true)
    val bicycle = Bicycle("Trek", "FX 3", 2022, 24)

    car.start()  // Output: Turning key in ignition...
    car.stop()   // Output: Applying brakes and turning off engine...
    println(car.numDoors) // Output: 4

    motorcycle.start()  // Output: Kicking starter...
    motorcycle.stop()  // Output: Applying brakes and turning off engine...
    println(motorcycle.hasSidecar) // Output: true

    bicycle.start()  // Output: Pedaling...
    bicycle.stop()  // Output: Applying brakes...
println(bicycle.numGears) // Output: 24
    
    list_name(listOf(car, motorcycle, bicycle))
    // Output: 
    // Honda Civic 2022
// Harley Davidson Fat Boy 2022
// Trek FX 3 2022

}
