package start;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력받기
		System.out.print("양의 숫자를 입력하세요 : ");
		
		while (true) {
			int num = sc.nextInt();
			
			// 양수라면 합을 구하고 종료
			if (num >= 1) {
				int sum = 0;
				for (int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.print("1부터 " + num + "까지의 합은 " + sum + "입니다.");
				break;
				
			// 음수라면 양수를 입력할때 까지 반복
			} else {
				System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");			
			}
		}

	}

}
