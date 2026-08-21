package day02;

public class GetMax {

	public void getMax(int[] numList) {
		int max = numList[0];
		
		for (int i = 1; i < numList.length; i++) {
			if (numList[i] > max) {
				max = numList[i];
			}
		}
		System.out.println("주어진 배열의 가장 큰 값은 " + max + "입니다.");
	}

	public static void main(String[] args) {
		int[] numList = {10, 30, 5, 90, 91};
		
		GetMax gm = new GetMax();
		
		gm.getMax(numList);
	}
}
 