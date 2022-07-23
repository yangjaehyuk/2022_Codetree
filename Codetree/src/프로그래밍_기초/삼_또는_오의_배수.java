package 프로그래밍_기초;

import java.util.Scanner;

public class 삼_또는_오의_배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%3==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		if(a%5==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
