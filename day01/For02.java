package start;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력 및 sum 변수 선언
		System.out.println("5개의 숫자를 입력하세요.");
		int sum = 0;
		
		// 5개의 숫자 입력 받기
		for (int i = 1; i <= 5; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		
		// sum 값 출력
		System.out.print("5개 숫자의 합은 " + sum + "입니다.");
	}

}
