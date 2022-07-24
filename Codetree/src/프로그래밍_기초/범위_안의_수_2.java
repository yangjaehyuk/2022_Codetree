package 프로그래밍_기초;

import java.util.Scanner;

public class 범위_안의_수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int val=0;
		for(int i=0;i<10;i++) {
			int n=sc.nextInt();
			if(n>=0 && n<=200) {
				cnt++;
				val+=n;
			}
		}
		System.out.printf("%d %.1f",val,(float)val/cnt);
	}

}
