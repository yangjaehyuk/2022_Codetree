package 프로그래밍_연습;

import java.util.Scanner;

public class 재귀함수를_이용한_피보나치_수 {
	public static int fibo(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n));
	}

}
