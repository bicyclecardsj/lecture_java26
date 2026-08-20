package start;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int student = sc.nextInt();
		
		int[] score = new int[student];
		int sum = 0;
		
		System.out.print(student + "명의 성적 : ");
		
		for (int i = 0; i < student; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
	
		int average = sum / student;
		
		System.out.println(">> 합계 : " + sum);
		System.out.println(">> 평균 : " + average);
	}

}
