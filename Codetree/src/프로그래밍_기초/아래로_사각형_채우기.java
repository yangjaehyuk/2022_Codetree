package 프로그래밍_기초;

import java.util.Scanner;

public class 아래로_사각형_채우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][]arr=new int[n][n];
		int cnt=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[j][i]=cnt;
				cnt++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
