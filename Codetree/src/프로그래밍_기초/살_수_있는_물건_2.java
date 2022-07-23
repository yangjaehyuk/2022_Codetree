package 프로그래밍_기초;

import java.util.Scanner;

public class 살_수_있는_물건_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=3000) {
			System.out.println("book");
		}
		else if(n>=1000) {
			System.out.println("mask");
		}
		else if(n>=500) {
			System.out.println("pen");
		}
		else {
			System.out.println("no");
		}
	}

}
