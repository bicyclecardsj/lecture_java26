package start;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 직사각형의 가로, 세로 입력 받기
		System.out.print("직사각형의 가로 길이 : ");
		double width = sc.nextDouble();
		System.out.print("직사각형의 세로 길이 : ");
		double height = sc.nextDouble();
		
		// 직사각형의 넓이 출력
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.", width * height);
	}

}
