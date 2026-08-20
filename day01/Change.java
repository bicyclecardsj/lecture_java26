package start;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 금액 입력받기
		System.out.print("금액 : ");
		int money = sc.nextInt();
		
		// 100원, 500원 갯수 출력
		System.out.println();
		System.out.println("동전의 수 >");
		System.out.println("500원짜리 = " + (money / 500) + "개");
		System.out.println("100원짜리 = " + ((money % 500) / 100) + "개");
	}

}
