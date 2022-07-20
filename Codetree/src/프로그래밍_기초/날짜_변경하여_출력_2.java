package 프로그래밍_기초;

import java.util.Scanner;

public class 날짜_변경하여_출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String [] strArr=s.split("-");
		System.out.printf("%s.%s.%s",strArr[2],strArr[0],strArr[1]);
	}

}
