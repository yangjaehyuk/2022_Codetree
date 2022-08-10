package 프로그래밍_기초;

import java.util.Scanner;

public class 격자로_사각형_만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++) {
			a[i][0]=1;
		}
		for(int j=0;j<n;j++) {
			a[0][j]=1;
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				a[i][j]=a[i-1][j-1]+a[i-1][j]+a[i][j-1];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
