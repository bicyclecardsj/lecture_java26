package start;

public class Array01 {

	public static void main(String[] args) {
		double[] gradeArr = { 90, 70, 80, 79, 82, 50, 70, 90, 89, 89 };
		
		// 총합 변수 선언
		double sum = 0;
		
		// 총합 더하기 반복문
		for (int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		
		// 평균 구하기
		double average = sum / gradeArr.length;

		// 출력
		System.out.println(">> 합계: " + sum);
		System.out.println(">> 평균: " + average);
	}

}
