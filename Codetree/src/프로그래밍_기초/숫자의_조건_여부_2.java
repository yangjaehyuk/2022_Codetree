package 프로그래밍_기초;

import java.util.Scanner;

public class 숫자의_조건_여부_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		a=sc.nextInt();
		if(a==5) {
			System.out.println("A");
		}
		if(a%2==0) {
			System.out.println("B");
		}
	}

}
