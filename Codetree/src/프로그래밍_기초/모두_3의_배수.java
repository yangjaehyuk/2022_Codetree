package 프로그래밍_기초;

import java.util.Scanner;

public class 모두_3의_배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		for(int i=0;i<5;i++) {
			int n=sc.nextInt();
			if(n%3==0) {
				cnt++;
			}
		}
		if(cnt==5) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
