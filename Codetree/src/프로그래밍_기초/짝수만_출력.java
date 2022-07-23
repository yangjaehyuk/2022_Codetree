package 프로그래밍_기초;

import java.util.Scanner;

public class 짝수만_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		while(a<=b) {
			System.out.print(a+" ");
			a+=2;
		}
	}

}
