package 프로그래밍_기초;

import java.util.Scanner;

public class 별표_출력하기_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
