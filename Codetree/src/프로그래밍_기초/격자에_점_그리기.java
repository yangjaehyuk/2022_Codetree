package 프로그래밍_기초;

import java.util.Scanner;

public class 격자에_점_그리기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[10][10];
		int cnt=1;
		for(int i=0;i<m;i++) {
			int r=sc.nextInt();
			int c=sc.nextInt();
			a[r][c]=cnt;
			cnt++;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
