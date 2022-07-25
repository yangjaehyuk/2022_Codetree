package 프로그래밍_기초;

import java.util.Scanner;

public class 친근하지_않은_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0 || i%3==0 || i%5==0) {
				cnt++;
				
			}
		}
		System.out.println(n-cnt);
	}

}
