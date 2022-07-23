package 프로그래밍_기초;

import java.util.Scanner;

public class 시력검사_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double eye=sc.nextDouble();
		if(eye>=1.0) {
			System.out.println("High");
		}
		else if(eye>=0.5) {
			System.out.println("Middle");
		}
		else {
			System.out.println("Low");
		}

	}

}
