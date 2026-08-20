package start;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자의 합과 숫자 변수 선언
		int sum = 0;
		int number = 1;
		
		// 0을 입력하기 전까지 계속 더하기
		while (number != 0) {
			System.out.print("숫자를 입력하세요 : ");
			number = sc.nextInt();
			sum += number;
		}
		
		// 더한 값 출력
		System.out.print("지금까지 입력한 숫자의 합은 " + sum + "입니다.");		
	}
}
