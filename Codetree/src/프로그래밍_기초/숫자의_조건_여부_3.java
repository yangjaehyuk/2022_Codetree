package 프로그래밍_기초;

import java.util.Scanner;

public class 숫자의_조건_여부_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a%13==0 || a%19==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
