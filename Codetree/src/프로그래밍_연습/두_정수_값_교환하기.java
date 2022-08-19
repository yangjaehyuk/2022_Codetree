package 프로그래밍_연습;

import java.util.Scanner;

public class 두_정수_값_교환하기 {
	public static void swap(int m, int n) {
		int temp=m;
		m=n;
		n=temp;
		System.out.print(m+" "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		swap(m, n);
	}

}
