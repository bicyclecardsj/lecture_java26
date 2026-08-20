package start;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 상수 PI 선언
		final double PI = 3.14;
		
		// 원의 반지름 입력받기
		System.out.print("원의 반지름을 입력하세요(cm) : ");
		double radius = sc.nextDouble();
		
		// 원의 넓이 출력
		System.out.printf("원의 넓이는 %.2fcm입니다.", radius * radius * PI);
	}

}
