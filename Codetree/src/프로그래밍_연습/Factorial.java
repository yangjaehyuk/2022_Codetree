package 프로그래밍_연습;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		if(n==0)
			return 1;
		
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}

}
