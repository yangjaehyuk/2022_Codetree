package 프로그래밍_기초;

import java.util.Scanner;

public class 별_n개_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=1;
		int n=sc.nextInt();
		while(i<=n) {
			System.out.println("*");
			i++;
		}
	}

}
