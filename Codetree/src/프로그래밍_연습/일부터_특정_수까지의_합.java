package 프로그래밍_연습;

import java.util.Scanner;

public class 일부터_특정_수까지의_합 {
	public static int s(int n) {
		int rst=0;
		for(int i=1;i<=n;i++) {
			rst+=i;
		}
		return rst/10;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));
	}

}
