package start;

import java.util.Scanner;

public class OddEven02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력받기
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		// 음수, 양수 판별 후 짝수, 홀수 판별
		if (number >= 0) {
			if (number % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");				
			}
		} else {
			System.out.println("양수가 아닙니다.");							
		}
	}

}
