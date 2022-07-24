package 프로그래밍_기초;

import java.util.Scanner;

public class 이_또는_삼의_배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(1+" ");
			}
			else {
				System.out.print(0+" ");
			}
		}
	}

}
