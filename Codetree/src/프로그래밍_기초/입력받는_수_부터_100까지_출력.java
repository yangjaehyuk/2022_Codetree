package 프로그래밍_기초;

import java.util.Scanner;

public class 입력받는_수_부터_100까지_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i<101;i++) {
			System.out.print(i+" ");
		}
	}

}
