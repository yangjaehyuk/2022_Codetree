package 프로그래밍_연습;

import java.util.Scanner;

public class 최대로_겹치는_구간 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[200];
		int max=0;
		for(int i=0;i<n;i++) {
			int cnt=1;
			int x1=sc.nextInt()+100;
			int x2=sc.nextInt()+100;
			for(int j=x1;j<=x2-1;j++) {
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
