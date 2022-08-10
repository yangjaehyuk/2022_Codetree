package 프로그래밍_기초;

import java.util.Scanner;

public class 배열로_사각형_만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a=new int[5][5];
		for(int i=0;i<5;i++) {
			a[i][0]=1;
		}
		for(int j=0;j<5;j++) {
			a[0][j]=1;
		}
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				a[i][j]=a[i-1][j]+a[i][j-1];
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
