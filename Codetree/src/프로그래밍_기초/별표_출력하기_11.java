package 프로그래밍_기초;

import java.util.Scanner;

public class 별표_출력하기_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=2*n+1;i++) {
			for(int j=1;j<=2*n+1;j++) {
				if(i%2!=0|| j%2!=0) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}

	}

}