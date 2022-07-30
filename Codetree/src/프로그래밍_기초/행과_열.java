package 프로그래밍_기초;

import java.util.Scanner;

public class 행과_열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}

}
