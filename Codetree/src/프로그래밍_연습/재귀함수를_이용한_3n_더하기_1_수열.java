package 프로그래밍_연습;

import java.util.Scanner;

public class 재귀함수를_이용한_3n_더하기_1_수열 {
	public static int cnt=0;
	public static int s(int n) {
		if(n==1)
			return cnt;
		if(n%2==0) {
			cnt++;
			return s(n/2);
		}
		else {
			cnt++;
			return s(n*3+1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));
	}

}
