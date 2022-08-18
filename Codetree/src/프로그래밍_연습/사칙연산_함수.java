package 프로그래밍_연습;

import java.util.Scanner;

public class 사칙연산_함수 {
	public static int hab(int a,int c) {
		return a+c;
	}
	public static int sub(int a,int c) {
		return a-c;
	}
	public static int div(int a,int c) {
		return a/c;
	}
	public static int mul(int a,int c) {
		return a*c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		char b=sc.next().charAt(0);
		int c=sc.nextInt();
		if(b=='+') {
			System.out.println(a+" "+b+" "+c+" "+"="+" "+hab(a,c));
		}
		else if(b=='-') {
			System.out.println(a+" "+b+" "+c+" "+"="+" "+sub(a,c));
		}
		else if(b=='/') {
			System.out.println(a+" "+b+" "+c+" "+"="+" "+div(a,c));
		}
		else if(b=='*'){
			System.out.println(a+" "+b+" "+c+" "+"="+" "+mul(a,c));
		}
		else {
			System.out.println("False");
		}
	}

}
