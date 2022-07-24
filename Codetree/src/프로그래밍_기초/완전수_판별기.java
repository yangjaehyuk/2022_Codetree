package 프로그래밍_기초;

import java.util.Scanner;

public class 완전수_판별기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int val=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				val+=i;
				if(val>=n) {
					break;
				}
			}
		}
		if(val==n) {
			System.out.println("P");
		}
		else {
			System.out.println("N");
		}
	}

}
