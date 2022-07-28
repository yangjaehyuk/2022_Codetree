package 프로그래밍_기초;

import java.util.Scanner;

public class 별표_출력하기_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n*2;i++) {
			if(i%2!=0) {
				for(int j=0;j<i/2+1;j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			else {
				for(int j=n;j>i/2-1;j--) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
	}

}
