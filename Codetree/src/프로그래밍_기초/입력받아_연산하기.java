package 프로그래밍_기초;

import java.util.Scanner;

public class 입력받아_연산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int r_a=a+87;
		int r_b=b%10;
		System.out.println(r_a);
		System.out.println(r_b);
	}

}
