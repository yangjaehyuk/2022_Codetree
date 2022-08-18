package 프로그래밍_연습;

import java.util.Scanner;

public class 함수를_이용한_윤년_판별 {
	public static boolean s(int n) {
		if(n%4!=0)
			return false;
		if(n%100!=0)
			return true;
		if(n%400==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(s(n))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
