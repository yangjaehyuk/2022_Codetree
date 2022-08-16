package 프로그래밍_기초;

import java.util.Scanner;

public class 소문자와_숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		a=a.toLowerCase();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i)>='0' && a.charAt(i)<='9') {
				System.out.print(a.charAt(i));
			}
		}
	}

}
