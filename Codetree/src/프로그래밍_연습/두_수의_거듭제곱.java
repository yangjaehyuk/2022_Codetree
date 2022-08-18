package 프로그래밍_연습;

import java.util.Scanner;

public class 두_수의_거듭제곱 {
	public static int s(int a, int b) {
		return (int) Math.pow(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(s(a,b));
		
	}

}
