package start;

import java.util.Scanner;

public class OddEven01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력받기
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		// 짝수, 홀수 판별 후 출력
		System.out.print((number % 2 == 0) ? "짝수" : "홀수");
	}

}
