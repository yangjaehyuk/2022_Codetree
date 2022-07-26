package 프로그래밍_기초;

import java.util.Scanner;

public class 출석_부르기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			if(n==1) {
				System.out.println("John");
			}
			else if(n==2) {
				System.out.println("Tom");
			}
			else if(n==3) {
				System.out.println("Paul");
			}
			else if(n==4) {
				System.out.println("Sam");
			}
			else {
				System.out.println("Vacancy");
				break;
			}
		}
	}

}
