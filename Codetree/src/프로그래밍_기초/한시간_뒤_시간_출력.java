package 프로그래밍_기초;

import java.util.Scanner;

public class 한시간_뒤_시간_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String[] strArr=s.split(":");
		String a=strArr[0];
		String b=strArr[1];
		int h=Integer.parseInt(a);
		int m=Integer.parseInt(b);
		System.out.printf("%d:%d",h+1,m);
	}

}
