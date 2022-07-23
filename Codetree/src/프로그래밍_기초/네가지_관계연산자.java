package 프로그래밍_기초;

import java.util.Scanner;

public class 네가지_관계연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(a>=b?1:0);
		System.out.println(a>b?1:0);
		System.out.println(b>=a?1:0);
		System.out.println(b>a?1:0);
	
	}

}
