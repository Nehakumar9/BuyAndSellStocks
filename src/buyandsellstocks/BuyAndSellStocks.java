package buyandsellstocks;

import java.util.Scanner;

public class BuyAndSellStocks {

	public static int sellStocks(int array[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
				index = i;
			}
		}
		for(int j=index+1;j<array.length;j++) {
			if(array[j]>max) {
				max = array[j];
			}
		}
		return max - min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]= scanner.nextInt();
		}
		int results = sellStocks(array);
		System.out.println(results);
	}
}
