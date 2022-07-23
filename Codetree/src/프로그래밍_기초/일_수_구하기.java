package 프로그래밍_기초;

import java.util.Scanner;

public class 일_수_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month=sc.nextInt();
		if(month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 || month==12) {
			System.out.println("31");
		}
		else if(month==2) {
			System.out.println("28");
		}
		else {
			System.out.println("30");
		}
	}

}
