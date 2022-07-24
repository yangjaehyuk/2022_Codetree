package 프로그래밍_기초;

import java.util.Scanner;

public class 홀수만_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2!=0 && arr[j]%3==0) {
				System.out.println(arr[j]);
			}
		}
	}

}
