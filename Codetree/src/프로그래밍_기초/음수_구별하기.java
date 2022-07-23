package 프로그래밍_기초;

import java.util.Scanner;

public class 음수_구별하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		if(n<0) {
			System.out.println("minus");
		}
	}

}
