package 프로그래밍_연습;

import java.util.Scanner;

public class 반복_출력하기_2 {
	public static void s(int n) {
		if(n==0)
			return;
		s(n-1);
		System.out.println("HelloWorld");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		s(n);
	}

}
