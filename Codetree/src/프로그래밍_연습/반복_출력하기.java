package 프로그래밍_연습;

import java.util.Scanner;

public class 반복_출력하기 {
	public static void s() {
		System.out.println("12345^&*()_");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			s();
		}
		
	}

}
