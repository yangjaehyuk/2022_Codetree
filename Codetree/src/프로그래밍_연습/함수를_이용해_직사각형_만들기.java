package 프로그래밍_연습;

import java.util.Scanner;

public class 함수를_이용해_직사각형_만들기 {
	public static void s(int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		s(n,m);
	}

}
