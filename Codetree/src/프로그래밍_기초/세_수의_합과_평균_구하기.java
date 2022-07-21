package 프로그래밍_기초;

import java.util.Scanner;

public class 세_수의_합과_평균_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int total=a+b+c;
		int average=(a+b+c)/3;
		System.out.println(total);
		System.out.println(average);
	}

}
