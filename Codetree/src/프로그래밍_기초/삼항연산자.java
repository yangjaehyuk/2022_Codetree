package 프로그래밍_기초;

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		score=sc.nextInt();
		String pass="pass";
		String failure="failure";
		System.out.printf("%s",score<100?failure:pass);
		
	}

}
