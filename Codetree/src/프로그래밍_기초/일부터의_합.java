package 프로그래밍_기초;

import java.util.Scanner;

public class 일부터의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int val=0;
		for(int i=1;i<=n;i++) {
			val+=i;
			if(val>=n) {
				System.out.println(i);
				break;
			}
		}
	}

}
