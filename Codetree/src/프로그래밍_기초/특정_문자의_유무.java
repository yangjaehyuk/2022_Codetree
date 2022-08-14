package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_문자의_유무 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		if(s.contains("ee")) {
			System.out.print("Yes ");
		}
		else {
			System.out.print("No ");
		}
		if(s.contains("ab")) {
			System.out.print("Yes ");
		}
		else {
			System.out.print("No ");
		}
	}

}
