package 프로그래밍_기초;

import java.util.Scanner;

public class 날짜_변경하여_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String [] strArr=s.split("\\.");
		String a=strArr[0];
		String b=strArr[1];
		String c=strArr[2];
		System.out.printf("%s-%s-%s",b,c,a);
	}

}
