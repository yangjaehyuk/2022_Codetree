package 프로그래밍_연습;

import java.util.Scanner;

public class _1부터_특정_수까지의_합_2 {
	public static int s(int n) {
		if(n==1)
			return 1;
		return s(n-1)+n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));

	}

}
