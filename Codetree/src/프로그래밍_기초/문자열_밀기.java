package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_밀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int slen=s.length();
		s=s.substring(1)+s.substring(0,1);
		System.out.println(s);
	}

}
