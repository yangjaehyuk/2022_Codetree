package 프로그래밍_기초;

import java.util.Scanner;

public class n번_더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,n;
		a=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(a+=n);
		}
	}

}
