package 프로그래밍_기초;

import java.util.Scanner;

public class 실수와_문자_받아_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c=sc.next();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println(c);
		System.out.printf("%.2f\n",a);
		System.out.printf("%.2f\n",b);
	}

}
