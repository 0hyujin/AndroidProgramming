//10명의 퀴즈 점수 15, 4, 8, 9, 13, 12, 10, 9, 11, 6 을 저장하고 있는 배열의 최소 점수와 평균 점수를 출력하는 프로그램을 작성하시오. 함수X
fun main() {
	
	//listOf 고정 배열 선언 및 데이터 삽입 실시
	var arr_data = arrayOf(15, 4, 8, 9, 13, 12, 10, 9, 11, 6)

	var int_arr_min = arr_data.min() //최소값
	var int_arr_max = arr_data.max() //최대값
	var int_arr_avg = arr_data.average() //평균값

	println("최소 : "+int_arr_min)
	println("최대 : "+int_arr_max)
	println("평균 : "+int_arr_avg)
	
}//메인 종료
