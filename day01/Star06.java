package start;

import java.util.Scanner;

public class Star06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력 받기
		System.out.print("숫자를 입력해주세요. : ");
		int num = sc.nextInt();
		
		// 5번 반복
		for (int i = 1; i <= num; i++) {
			// 공백 0 ~ 4 반복
			for (int j = 0; j < (i - 1); j++) {
				System.out.print(" ");
			}
			// 별 5 ~ 1 반복
			for (int k = num; k >= i; k--) {
				System.out.print("*");				
			}
			// 별 4 ~ 0 반복
			for (int l = i; l < num; l++) {
				System.out.print("*");								
			}
			System.out.println();
		}
	}

}
