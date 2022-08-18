package 프로그래밍_연습;

import java.util.Scanner;

public class 함수를_이용한_소수_판별 {
	public static boolean s(int n) {
		int cnt=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int total=0;
		for(int i=a;i<=b;i++) {
			if(s(i)) {
				total+=i;
			}
		}
		System.out.println(total);
		
	}

}
