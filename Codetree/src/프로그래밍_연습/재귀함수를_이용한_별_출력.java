package 프로그래밍_연습;

import java.util.Scanner;

public class 재귀함수를_이용한_별_출력 {
	public static void s(int n) {
		if(n==0)
			return;
		s(n-1);
		for(int i=1;i<=n;i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		s(n);
	}

}
