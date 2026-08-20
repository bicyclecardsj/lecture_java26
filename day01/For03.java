package start;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력받기
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 구구단 반복해서 출력
		System.out.print("[ 구구단 " + num + "단]");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));			
		}
	}

}
