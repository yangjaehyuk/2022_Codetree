package 프로그래밍_기초;

import java.util.Scanner;

public class ab곱_n번_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int ans=1;
			for(int j=a;j<=b;j++) {
				ans*=j;
			}
			System.out.println(ans);
		}
	}

}
