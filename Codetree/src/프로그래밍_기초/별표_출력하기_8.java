package 프로그래밍_기초;

import java.util.Scanner;

public class 별표_출력하기_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println("*");
			}
			else {
				for(int j=0;j<i;j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
	}

}
