package start;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력 받기
		System.out.print("숫자를 입력해주세요. : ");
		int num = sc.nextInt();
		
		// j가 i보다 작을때 오른쪽으로 하나씩 별찍기
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
