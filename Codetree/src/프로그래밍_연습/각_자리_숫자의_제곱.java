package 프로그래밍_연습;

import java.util.Scanner;

public class 각_자리_숫자의_제곱 {
	public static int s(int n) {
		if(n<10)
			return n*n;
		return s(n/10)+(n%10)*(n%10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));
	}

}
