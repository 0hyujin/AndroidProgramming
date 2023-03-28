// Exercise: Vector Addition
// 벡터 표현을 위한 Vector 클래스를 만들고 plus 연산자를 오버로딩한다.
// Vector 클래스는 다음 속성을 갖는다.
// •	x (the x-coordinate of the vector)
// •	y (the y-coordinate of the vector)
// Vector 클래스는 다음 메소드를 갖는다.
// •	toString (벡터를 문자열로 변환, 예를 들어  (x, y) 와 같은 형태로 만든다.)
// •	operator plus (두 벡터를 더한 결과를 리턴)

data class Vector(val x: Int, val y: Int){
	operator fun plus(other : Vector): Vector
    		=Vector(x + other.x, y + other.y)
    override fun toString(): String = "$x, ${y}"
}

operator fun Vector.minus(other:Vector): Vector
		= Vector(x - other.x, y - other.y)

fun main(){
    val v1 = Vector(1, 2)
	val v2 = Vector(3, 4)

	println(v1 + v2) // Output: (4, 6)
}
