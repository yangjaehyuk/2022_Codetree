package 프로그래밍_기초;

import java.util.Scanner;

public class 아스키코드의_합과_차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		int a_a=(int)a;
		int b_b=(int)b;
		System.out.print(a_a+b_b+" ");
		if(a_a>b_b) {
			System.out.println(a_a-b_b);
		}
		else {
			System.out.println(b_b-a_a);
		}
	}

}
