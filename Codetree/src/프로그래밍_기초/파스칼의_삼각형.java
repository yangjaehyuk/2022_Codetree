package 프로그래밍_기초;

import java.util.Scanner;

public class 파스칼의_삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][]a=new int[n+1][n+1];
		for(int i=0;i<n;i++) {
			a[i][0]=1;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<=i) {
					a[i][j]=1;
				}
				
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				a[i][j]=a[i-1][j-1]+a[i-1][j];
				
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]!=0)
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
