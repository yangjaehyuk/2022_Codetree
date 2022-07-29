package 프로그래밍_기초;

import java.util.Scanner;

public class 순서쌍_만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				System.out.printf("(%d,%d) ",i,j);
			}
			System.out.println();
		}
	}

}
