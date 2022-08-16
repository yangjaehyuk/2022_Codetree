package 프로그래밍_기초;

import java.util.Scanner;

public class 붙여서_합하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int s=Integer.parseInt(a+b);
		int c=Integer.parseInt(b+a);
		System.out.println(s+c);
	}

}
