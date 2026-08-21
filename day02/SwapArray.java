package day02;

public class SwapArray {
	
	public int[] swapArray(int[] numList) {
		for (int i = 0; i < (numList.length / 2); i++) {
			int temp = numList[i];
			numList[i] = numList[numList.length - 1 - i];
			numList[numList.length - 1 - i] = temp;
		}
		return numList;
	}

	public static void main(String[] args) {
			int[] numList = {10, 30, 5, 90, 91};
			
			SwapArray sa = new SwapArray();
			sa.swapArray(numList);
			
			for (int i = 0; i < numList.length; i++) {
				System.out.print(numList[i] + " ");
			}
			
	}
	
}
				
