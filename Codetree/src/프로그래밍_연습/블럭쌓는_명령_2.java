package 프로그래밍_연습;

import java.util.Scanner;

public class 블럭쌓는_명령_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int max=0;
		int[] arr=new int[n];
		for(int i=0;i<k;i++) {
			int cnt=1;
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(int j=a;j<=b;j++) {
				arr[j]+=cnt;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];	
		}
		System.out.println(max);
	}

}
