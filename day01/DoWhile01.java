package start;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int sum = 0;
		int num;
		
		// 0이 나오기 전까지 더하기
		do {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			sum += num;
		} while (num != 0);
		
		// sum 값 출력하기
		System.out.print("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
	}

}
