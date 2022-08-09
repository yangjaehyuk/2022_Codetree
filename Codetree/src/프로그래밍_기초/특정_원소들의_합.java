package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_원소들의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int sum=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				if(i>j) {
					sum+=arr[i-1][j];
				}
			}
		}
		System.out.println(sum);
	}

}
