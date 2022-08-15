package 프로그래밍_기초;

import java.util.Scanner;

public class 양옆_문자_제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		s=s.substring(0, 1)+s.substring(2);
		s=s.substring(0, s.length()-2)+s.substring(s.length()-1);
		System.out.println(s);
	}

}
