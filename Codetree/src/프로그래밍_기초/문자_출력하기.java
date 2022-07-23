package 프로그래밍_기초;

import java.util.Scanner;

public class 문자_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		for(int i=1;i<9;i++) {
			System.out.printf("%s",s);
		}
	}

}
