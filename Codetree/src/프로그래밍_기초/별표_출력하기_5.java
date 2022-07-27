package 프로그래밍_기초;

import java.util.Scanner;

public class 별표_출력하기_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				for(int k=i;k>=1;k--) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
