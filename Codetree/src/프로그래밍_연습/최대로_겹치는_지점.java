package 프로그래밍_연습;

import java.util.Scanner;

public class 최대로_겹치는_지점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		int[] arr=new int[101];
		for(int i=0;i<n;i++) {
			int cnt=1;
			int x1=sc.nextInt();
			int x2=sc.nextInt();
			for(int j=x1;j<=x2;j++) {
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
