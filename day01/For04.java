package start;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력받기
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int result = 1;
		
		// 팩토리얼 계산
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		
		// result 출력
		System.out.print(num + "!" + " = " + result);
	}

}
