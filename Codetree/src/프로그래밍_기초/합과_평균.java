package 프로그래밍_기초;

import java.util.Scanner;

public class 합과_평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int plus=a+b;
		double average=((double)(a+b)/2);
		System.out.printf("%d %.1f",plus,average);
	}

}
