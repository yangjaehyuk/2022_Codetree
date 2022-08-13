package 프로그래밍_기초;

import java.util.Scanner;

public class 두_문자열을_이어붙였을_때 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String s=a+b;
		String c=b+a;
		boolean k=true;
		for(int i=0;i<a.length()+b.length();i++) {
			if(s.charAt(i)!=c.charAt(i)) {
				k=false;
				break;
			}
		}
		if(k==false) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
	}

}
