package 프로그래밍_연습;

import java.util.Scanner;

public class _100으로_나눈_나머지의_수열 {
	public static int s(int n) {
		if(n==1)
			return 2;
		if(n==2)
			return 4;
		else {
			return (s(n-1)*s(n-2))%100;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));
	}

}
