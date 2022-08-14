package 프로그래밍_기초;

import java.util.Scanner;

public class 부분문자열_위치_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		for(int i=0;i<a.length();i++) {
			if(i+b.length()-1>=a.length())
				continue;
			boolean match=true;
			for(int j=0;j<b.length();j++) {
				if(a.charAt(i+j)!=b.charAt(j)) {
					match=false;
				}
			}
			if(match) {
				System.out.print(i);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}

}
