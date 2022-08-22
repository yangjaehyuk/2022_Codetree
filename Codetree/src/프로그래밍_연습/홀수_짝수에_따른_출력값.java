package 프로그래밍_연습;

import java.util.Scanner;

public class 홀수_짝수에_따른_출력값 {
	public static int total=0;
	public static int s(int n) {
		if(n%2!=0) {
			for(int i=1;i<=n;i+=2) {
				total+=i;
			}
		}
		else {
			for(int i=2;i<=n;i+=2)
				total+=i;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(s(n));
	}

}
