package 프로그래밍_기초;

import java.util.Scanner;

public class 배열의_평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr=new int[2][4];
		for(int i=0;i<2;i++) {
			int sum=0;
			for(int j=0;j<4;j++) {
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
			System.out.printf("%.1f ",(double)sum/4);
		}
		System.out.println();
		for(int i=0;i<4;i++) {
			int sum=0;
			for(int j=0;j<2;j++) {
				sum+=arr[j][i];
			}
			System.out.printf("%.1f ",(double)sum/2);
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.printf("%.1f ",(double)sum/8);
	}

}
