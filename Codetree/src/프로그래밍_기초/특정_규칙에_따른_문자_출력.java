package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_규칙에_따른_문자_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("@"+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print("@"+" ");
			}
			System.out.println();
		}
	}

}
