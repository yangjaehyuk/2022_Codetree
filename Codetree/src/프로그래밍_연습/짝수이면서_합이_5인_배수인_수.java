package 프로그래밍_연습;

import java.util.Scanner;

public class 짝수이면서_합이_5인_배수인_수 {
	public static boolean s(int n) {
		return n%2==0 && (n/10+(n%10))%5==0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(s(n)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
