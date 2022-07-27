package 프로그래밍_기초;

import java.util.Scanner;

public class 건너뛰고_별표_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			
			}
			System.out.println();
			System.out.println();
		}
	
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
