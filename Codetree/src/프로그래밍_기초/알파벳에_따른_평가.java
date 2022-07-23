package 프로그래밍_기초;

import java.util.Scanner;

public class 알파벳에_따른_평가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string=sc.next();
		char s=string.charAt(0);
		if(s=='S') {
			System.out.println("Superior");
		}
		else if(s=='A') {
			System.out.println("Excellent");
		}
		else if(s=='B') {
			System.out.println("Good");
		}
		else if(s=='C') {
			System.out.println("Usually");
		}
		else if(s=='D') {
			System.out.println("Effort");
		}
		else
		{
			System.out.println("Failure");
		}
	}	

}
