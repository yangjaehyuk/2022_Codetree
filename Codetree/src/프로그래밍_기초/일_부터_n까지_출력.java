package 프로그래밍_기초;

import java.util.Scanner;

public class 일_부터_n까지_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++) {
			System.out.print(i+" ");
		}
	}

}
