package start;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력받기
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
				
		// 숫자 1부터 입력 받은 숫자까지 더하기
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// sum 값 출력
		System.out.print("1부터 " + num + "까지의 합은 " + sum + "입니다.");
	}

}
