package 프로그래밍_기초;

import java.util.Scanner;

public class 정수_입력받아_배수_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i<n*5+1;i+=n) {
			System.out.print(i+" ");
		}
	}

}
