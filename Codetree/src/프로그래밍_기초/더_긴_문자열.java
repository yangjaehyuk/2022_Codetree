package 프로그래밍_기초;

import java.util.Scanner;

public class 더_긴_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if(a.length()>b.length()) {
			System.out.println(a+" "+a.length());
		}
		else if(b.length()>a.length()){
			System.out.println(b+" "+b.length());
		}
		else {
			System.out.println("same");
		}
	}

}
