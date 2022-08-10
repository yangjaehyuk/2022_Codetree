package 프로그래밍_기초;

import java.util.Scanner;

public class 격자_반대로_채우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=1;
		int [][] a=new int[100][100];
		if(n%2==0) {
			for(int i=n;i>0;i--) {
				if(i%2==0) {
					for(int j=n-1;j>=0;j--) {
						a[j][i]=cnt;
						cnt++;
					}
				}
				else {
					for(int j=0;j<n;j++) {
						a[j][i]=cnt;
						cnt++;
					}
				}
			}
		}
		else {
			for(int i=n;i>0;i--) {
				if(i%2==0) {
					for(int j=0;j<n;j++) {
						a[j][i]=cnt;
						cnt++;
					}
				}
				else {
					for(int j=n-1;j>=0;j--) {
						a[j][i]=cnt;
						cnt++;
					}
				}
			}
			
		}
		for(int j=0;j<=n;j++) {
			for(int i=0;i<=n;i++) {
				if(a[j][i]!=0) {
					System.out.print(a[j][i]+" ");
				}
			}
			System.out.println();
		}
	}

}
