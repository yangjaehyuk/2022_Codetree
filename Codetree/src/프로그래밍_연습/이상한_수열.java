package 프로그래밍_연습;

import java.util.Scanner;

public class 이상한_수열 {
	public static int s(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return s(n/3)+s(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));
	}

}
