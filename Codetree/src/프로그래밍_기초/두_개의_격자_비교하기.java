package 프로그래밍_기초;

import java.util.Scanner;

public class 두_개의_격자_비교하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][]a=new int[n][m];
		int[][]b=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][j]!=b[i][j])
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}

}
