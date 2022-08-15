package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_돌리기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int slen=s.length();
		System.out.println(s);
		for(int i=0;i<slen;i++) {
			s=s.substring(slen-1)+s.substring(0,slen-1);
			System.out.println(s);
		}
	}

}
