package 프로그래밍_기초;

import java.util.Scanner;

public class 두수의_곱과_몫 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d",a,b,a/b);
	}

}
