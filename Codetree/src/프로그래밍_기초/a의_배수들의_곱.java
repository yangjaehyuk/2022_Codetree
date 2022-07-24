package 프로그래밍_기초;

import java.util.Scanner;

public class a의_배수들의_곱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int prod=1;
		for(int i=1;i<=b;i++) {
			if(i%a==0) {
				prod*=i;
			}
		}
		System.out.println(prod);
	}

}
