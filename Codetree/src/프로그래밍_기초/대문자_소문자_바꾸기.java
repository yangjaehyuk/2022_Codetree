package 프로그래밍_기초;

import java.util.Scanner;

public class 대문자_소문자_바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		for(int i=0;i<a.length();i++) {
			if((int)a.charAt(i)>=97 && (int)a.charAt(i)<=122) {
				int b=(int)a.charAt(i)-32;
				System.out.print((char)b);
			}
			else {
				int b=(int)a.charAt(i)+32;
				System.out.print((char)b);
			}
		}
	}

}
