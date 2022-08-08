package 프로그래밍_기초;

import java.util.Scanner;

public class 자동차_단일_거래_이익_최대화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int max = 0;
		    int minPrice = arr[0];
		    for(int i = 0; i < n; i++) {
		    	int profit = arr[i] - minPrice;
		        if(profit > max)
		        	max = profit;
		            
		        if(minPrice > arr[i])
		        	minPrice = arr[i];
		   }
		        System.out.print(max);
	}
}
