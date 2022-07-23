package 프로그래밍_기초;

import java.util.Scanner;

public class 네_번의_크기_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b,c,d,e;
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		System.out.println(a>b?1:0);
		System.out.println(a>c?1:0);
		System.out.println(a>d?1:0);
		System.out.println(a>e?1:0);
	}

}
