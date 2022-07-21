package 프로그래밍_기초;

import java.util.Scanner;

public class 두개의_정수를_서로_더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int first=a+b;
		int second=first+b;
		System.out.printf("%d %d",first,second);
	}

}
