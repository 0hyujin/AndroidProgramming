// Collection map 연습
// 정수 리스트를 인자로 받아서 아래와 같이 새 리스트를 만들어서 리턴하는 함수를 작성하시오. 
// -	인자로 받은 리스트의 원소 중 홀수인 원소는 2배를 하고, 짝수인 원소는 그대로 사용하여 새 리스트를 만든다.

fun doubleOddNumbers(list: List<Int>): List<Int> {
    // TODO: implement function
	return list.map{
        if (it %2==1)
        	it *2
        else it
    }
}

fun main()
{
    val testCases = listOf(
        Pair(listOf(1, 2, 3, 4, 5), listOf(2, 2, 6, 4, 10)),
        Pair(listOf(2, 4, 6, 8), listOf(2, 4, 6, 8)),
        Pair(listOf(1, 3, 5, 7), listOf(2, 6, 10, 14))
    )

    for ((input, expectedOutput) in testCases) {
        val actualOutput = doubleOddNumbers(input)
        if (actualOutput != expectedOutput) {
            println("Test failed for input $input. Expected output: $expectedOutput. Actual output: $actualOutput")
        } else {
            println("Test passed for input $input")
        }
    }
}
