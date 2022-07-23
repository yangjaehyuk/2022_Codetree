package 프로그래밍_기초;

import java.util.Scanner;

public class 정사각형의_넓이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n*n);
		if(n<5) {
			System.out.println("tiny");
		}
	}

}
