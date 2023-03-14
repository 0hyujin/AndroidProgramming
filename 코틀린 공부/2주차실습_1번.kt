//루프(for)를 2번 사용하여 구구단 출력하도록 프로그램 만들기. 
fun main() {
    println("코틀린 구구단 출력")
    
    for (x in 2 .. 9) {
        println("== ${x}단 ==")
        for (y in 1 .. 9) {
            println("$x x $y = ${x*y}")
        }
    }
    
}
