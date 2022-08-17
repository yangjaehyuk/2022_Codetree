package 프로그래밍_연습;

import java.util.Scanner;

public class 숫자로_이루어진_사각형 {
	public static void s(int n, int cnt) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(cnt+" ");
				cnt++;
				if(cnt>9) {
					cnt=1;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=1;
		s(n,cnt);
	}

}
