package 프로그래밍_기초;

import java.util.Scanner;

public class 배수의_개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt3=0;
		int cnt5=0;
		for(int i=0;i<10;i++) {
			int n=sc.nextInt();
			if(n%3==0) {
				cnt3++;
			}
			if(n%5==0) {
				cnt5++;
			}
		}
		System.out.printf("%d %d",cnt3,cnt5);
	}

}
