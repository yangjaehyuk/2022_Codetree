package 프로그래밍_기초;

import java.util.Scanner;

public class 구구단으로_이루어진_직각_삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.printf("%d * %d = %d ",i,j,i*j);
				if(j>=n-i+1) {
					System.out.print(" ");
				}
				else {
					System.out.print("/ ");
				}
			}
			System.out.println();
		}
	}

}
