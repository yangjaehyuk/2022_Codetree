package 프로그래밍_기초;

import java.util.Scanner;

public class 문자_교체하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		a=a.substring(0, 2);
		b=b.substring(2, b.length());
		System.out.println(a+b);
	}

}
