package 프로그래밍_기초;

import java.util.Scanner;

public class 세_수의_중간값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b>a && b<c) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
