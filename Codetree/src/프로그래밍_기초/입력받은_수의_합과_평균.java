package 프로그래밍_기초;

import java.util.Scanner;

public class 입력받은_수의_합과_평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int val=0;
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			val+=s;
		}
		System.out.printf("%d %.1f",val,(float)val/n);
	}

}
