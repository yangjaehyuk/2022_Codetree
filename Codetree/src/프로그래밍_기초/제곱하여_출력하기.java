package 프로그래밍_기초;

import java.util.Scanner;

public class 제곱하여_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			System.out.print(a*a+" ");
		}
	}

}
