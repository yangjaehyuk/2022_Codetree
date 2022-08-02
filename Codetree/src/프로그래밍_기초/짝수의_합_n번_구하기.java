package 프로그래밍_기초;

import java.util.Scanner;

public class 짝수의_합_n번_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int rst=0;
			for(int j=a;j<=b;j++) {
				if(j%2==0) {
					rst+=j;
				}
			}
			System.out.println(rst);
		}
	}

}
