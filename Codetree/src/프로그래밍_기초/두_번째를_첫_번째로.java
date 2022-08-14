package 프로그래밍_기초;

import java.util.Scanner;

public class 두_번째를_첫_번째로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char a=s.charAt(0);
		char b=s.charAt(1);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==b) {
				s=s.substring(0,i)+a+s.substring(i+1);
			}
		}
		System.out.println(s);
	}

}
