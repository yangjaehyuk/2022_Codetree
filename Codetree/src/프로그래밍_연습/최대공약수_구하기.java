package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class 최대공약수_구하기 {
	public static void s(int n, int m) {
		int[] arr=new int[101];
		for(int i=1;i<=m;i++) {
			if(n%i==0 && m%i==0) {
				arr[i]=i;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		s(n,m);
	}

}
