package start;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력받기
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		// 짝수, 홀수 판별
		switch (number % 2) {
			case 0:
				System.out.print("짝수입니다.");
				break;
			case 1:
				System.out.print("홀수입니다.");
				break;
				
		}
	}

}
