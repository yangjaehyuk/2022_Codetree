package 프로그래밍_기초;

import java.util.Scanner;

public class 별표_출력하기_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<(2*n)-(2*i)-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<(2*n)-(2*i)-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
