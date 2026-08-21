package day02;

import java.util.Scanner;

public class GetCount {
	
	public int getCount(int[] numList, int target) {
		int count = 0;
		
		for (int i = 0; i < numList.length; i++) {
			if (numList[i] > target) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int[] numList = {10, 30, 5, 90, 91};
		int target = sc.nextInt();
		
		GetCount gc = new GetCount();
		int result = gc.getCount(numList, target);
		
		System.out.println("배열내에 입력한 숫자보다 큰 숫자의 개수는 " + result + "개 입니다.");
		
	}
}
		
