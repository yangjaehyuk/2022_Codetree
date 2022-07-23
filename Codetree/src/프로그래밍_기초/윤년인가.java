package 프로그래밍_기초;

import java.util.Scanner;

public class 윤년인가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0 && (year%100!=0 || year%400==0) ) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
	}

}
