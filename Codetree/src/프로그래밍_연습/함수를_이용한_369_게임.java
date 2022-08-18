package 프로그래밍_연습;

import java.util.Scanner;

public class 함수를_이용한_369_게임 {
	public static boolean s(int n) {
		return n%3==0||number(n);
	}
	public static boolean number(int n) {
		while(n>0) {
			if(n%10==3 || n%10==6 ||n%10==9 || n/10==3 || n/10==6 || n/10==9) {
				return true;
			}
			n/=10;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int cnt=0;
		for(int i=a;i<=b;i++) {
			if(s(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
