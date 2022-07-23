package 프로그래밍_기초;

import java.util.Scanner;

public class n부터_1까지_숫자_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n>=1) {
			System.out.print(n+" ");
			n--;
		}
	}

}
