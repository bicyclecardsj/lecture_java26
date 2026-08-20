package start;

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력 받기
		System.out.print("숫자를 입력해주세요. : ");
		int num = sc.nextInt();
		
		// 5줄 반복
		for (int i = 1; i <= num; i++) {
			// 공백 4 ~ 1 반복
			for (int j = 1; j <= (num - i); j++) {
				System.out.print(" ");
			}
			// 별 1 ~ 5 반복
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
