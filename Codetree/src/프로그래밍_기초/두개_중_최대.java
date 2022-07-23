package 프로그래밍_기초;

import java.util.Scanner;

public class 두개_중_최대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int n=a>b?a:b;
		System.out.println(n);
	}

}
