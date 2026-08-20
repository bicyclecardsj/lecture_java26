package start;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 숫자 입력 받은 후 짝수, 홀수 판별
			System.out.print("숫자를 입력하세요 : ");
			int number = sc.nextInt();
			if (number % 2 == 0) {
				System.out.println(">> 짝수입니다.");
			} else {
				System.out.println(">> 홀수입니다.");				
			}
			
			// 반복문을 멈출지 말지 결정
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			int choice = sc.nextInt();
			
			if (choice == 0) {
				break;
			}
			System.out.println();
		}
	}

}
