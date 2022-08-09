package 프로그래밍_기초;

import java.util.Scanner;

public class 두_배열의_곱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][]a=new int[3][3];
		int[][]b=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]*b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
