package day02;

public class GetSum {

	public int getSum(int[] numList) {
		int sum = 0;
		for (int i = 0; i < numList.length; i++) {
			sum += numList[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] numList = {10, 30, 5, 90, 91};
		
		GetSum gs = new GetSum();
		int result = gs.getSum(numList);
		
		System.out.println("배열 내 숫자들의 총합은 " + result + "입니다.");
	}
}
