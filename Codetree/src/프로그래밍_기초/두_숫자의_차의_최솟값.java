package 프로그래밍_기초;

import java.util.Scanner;

public class 두_숫자의_차의_최솟값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int min=101;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]-arr[j]>0) {
					if(min>arr[i]-arr[j]) {
						min=arr[i]-arr[j];
					}
				}
				
			}
			
		}
		System.out.println(min);
		
	}

}
