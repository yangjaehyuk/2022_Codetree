package 프로그래밍_연습;

import java.util.Scanner;

public class 큰_숫자_자리수의_합 {
	public static int s(int n) {
		if(n<10)
			return n;
		return s(n/10)+n%10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(s(a*b*c));
	}

}
