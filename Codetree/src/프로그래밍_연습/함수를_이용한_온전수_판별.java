package 프로그래밍_연습;

import java.util.Scanner;

public class 함수를_이용한_온전수_판별 {
	public static boolean s(int n) {
		if(n%2==0)
			return false;
		else if(n%10==5) 
			return false;
		else if(n%3==0 && n%9!=0)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int cnt=0;
		for(int i=a;i<=b;i++) {
			if(s(i))
				cnt++;
		}
		System.out.println(cnt);
	}

}
