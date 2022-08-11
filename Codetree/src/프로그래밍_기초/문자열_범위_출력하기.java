package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_범위_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		for(int i=2;i<10;i++) {
			System.out.print(a.charAt(i));
		}
		
	}

}
