package 프로그래밍_기초;

import java.util.Scanner;

public class 이의_거듭제곱수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1;
		int cnt=0;
		while(true) {
			prod*=2;
			cnt++;
			if(prod==n) {
				System.out.println(cnt);
				break;
			}
		}
	}

}
