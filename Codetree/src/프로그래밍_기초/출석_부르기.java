package 프로그래밍_기초;

import java.util.Scanner;

public class 출석_부르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		if(number==1) {
			System.out.println("John");
		}
		else if(number==2) {
			System.out.println("Tom");
		}
		else if(number==3) {
			System.out.println("Paul");
		}
		else {
			System.out.println("Vacancy");
		}
	}

}
