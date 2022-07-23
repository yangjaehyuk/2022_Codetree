package 프로그래밍_기초;

import java.util.Scanner;

public class 두_숫자의_짝홀_여부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if(b%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
