package 프로그래밍_연습;

import java.util.Scanner;

public class 함수를_이용한_합과_소수_판별 {
	public static boolean s(int n) {
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			return true;
		}
		else
			return false;
	}
	public static boolean j(int n) {
		int sum=(n/100)+((n/10)%10)+(n%10);
		if(sum%2==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int cnt1=0;
		for(int i=a;i<=b;i++) {
			if(s(i) && j(i)) {
				cnt1++;
			}
		}
		System.out.println(cnt1);
	}

}
