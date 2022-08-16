package 프로그래밍_기초;

import java.util.Scanner;

public class 대문자로_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		a=a.toUpperCase();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) >='A' && a.charAt(i) <= 'Z' || a.charAt(i) >= 'a' && a.charAt(i) <= 'z'  ) {
					System.out.print(a.charAt(i));
			}
		}
	}

}
