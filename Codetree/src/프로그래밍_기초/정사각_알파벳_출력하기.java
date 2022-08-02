package 프로그래밍_기초;

import java.util.Scanner;

public class 정사각_알파벳_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)a);
				a++;
			}
			System.out.println();
		}
	}

}
