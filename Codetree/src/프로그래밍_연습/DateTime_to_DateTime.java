package 프로그래밍_연습;

import java.util.Scanner;

public class DateTime_to_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int diff=(a*24*60+b*60+c)-(11*24*60+11*60+11);
		if(diff<0)
			System.out.println(-1);
		else
			System.out.println(diff);
	}

}
