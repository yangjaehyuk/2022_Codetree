package 프로그래밍_기초;

import java.util.Scanner;

public class 등급_매기기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
