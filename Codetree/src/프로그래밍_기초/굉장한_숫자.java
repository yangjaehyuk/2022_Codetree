package 프로그래밍_기초;

import java.util.Scanner;

public class 굉장한_숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if((n%2!=0&&n%3==0)||(n%2==0&&n%5==0)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
