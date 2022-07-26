package 프로그래밍_기초;

import java.util.Scanner;

public class 수열_3n_더하기_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int n=sc.nextInt();
		while(true) {
			if(n==1) {
				System.out.println(cnt);
				break;
			}
			if(n%2==0) {
				n/=2;
				cnt++;
			}
			else {
				n*=3;
				n++;
				cnt++;
			}
			
		}
	}

}
