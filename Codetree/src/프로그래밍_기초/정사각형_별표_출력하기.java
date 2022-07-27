package 프로그래밍_기초;

import java.util.Scanner;

public class 정사각형_별표_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*"+"");
			}
			System.out.println();
		}
	}

}
