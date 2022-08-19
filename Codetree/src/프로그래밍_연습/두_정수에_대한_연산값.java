package 프로그래밍_연습;

import java.util.Scanner;

public class 두_정수에_대한_연산값 {
	public static int s(int a,int b) {
		if(a>b) {
			a+=25;
			return a;
		}
		else {
			a*=2;
			return a;
		}
	}
	public static int l(int a,int b) {
		if(a>b) {
			b*=2;
			return b;
		}
		else {
			b+=25;
			return b;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print(s(a,b)+" "+l(a,b));
	}

}
