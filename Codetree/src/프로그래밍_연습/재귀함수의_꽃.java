package 프로그래밍_연습;

import java.util.Scanner;

public class 재귀함수의_꽃 {
	public static void s(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");
		s(n-1);
		System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		s(n);
	}

}
