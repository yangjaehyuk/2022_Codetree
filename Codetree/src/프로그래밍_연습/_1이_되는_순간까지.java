package 프로그래밍_연습;

import java.util.Scanner;

public class _1이_되는_순간까지 {
	public static int cnt=0;
	public static int s(int n) {
		if(n==1)
			return cnt;
		if(n%2==0) {
			cnt++;
			return s(n/2);
		}
		else{
			cnt++;
			return s(n/3);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));
	}

}
