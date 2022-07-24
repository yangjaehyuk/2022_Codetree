package 프로그래밍_기초;

import java.util.Scanner;

public class a의_b승 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int prod=1;
		for(int i=0;i<b;i++) {
			prod*=a;
		}
		System.out.println(prod);
	}

}
