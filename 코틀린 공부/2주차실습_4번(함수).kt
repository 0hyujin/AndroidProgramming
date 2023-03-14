//10명의 퀴즈 점수 15, 4, 8, 9, 13, 12, 10, 9, 11, 6 을 저장하고 있는 배열의 최소 점수와 평균 점수를 출력하는 프로그램을 작성하시오. 
//단, 최소 점수와 평균 점수를 구하는 함수를 작성할 것.

fun arr_min(){
    var arr_data = arrayOf(15, 4, 8, 9, 13, 12, 10, 9, 11, 6)
    var int_arr_min = arr_data.min() //최소값
    println("최소 : "+int_arr_min)
}

fun arr_avg(){
    var arr_data = arrayOf(15, 4, 8, 9, 13, 12, 10, 9, 11, 6)
    var int_arr_avg = arr_data.average() //평균값
    println("평균 : "+int_arr_avg)
}

fun main() {
	//arrayOf 배열 선언 및 데이터 삽입 실시
	var arr_data = arrayOf(15, 4, 8, 9, 13, 12, 10, 9, 11, 6)

	arr_min()
    arr_avg()
}
