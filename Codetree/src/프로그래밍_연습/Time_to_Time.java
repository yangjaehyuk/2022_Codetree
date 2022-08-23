package 프로그래밍_연습;

import java.util.Scanner;

public class Time_to_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int minute=0;
		while(true) {
			if(a==c && b==d)
				break;
			b+=1;
			minute+=1;
			if(b==60) {
				b=0;
				a+=1;
			}
		}
		System.out.println(minute);
	}

}
