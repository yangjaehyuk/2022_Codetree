package 프로그래밍_기초;

import java.util.Scanner;

public class 그_전_알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a=='a') {
			System.out.println('z');
		}
		else {
			int b=(int)a-1;
			System.out.println((char)b);
		}
	}

}
