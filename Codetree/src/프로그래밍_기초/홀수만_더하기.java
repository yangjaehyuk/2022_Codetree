package 프로그래밍_기초;

import java.util.Scanner;

public class 홀수만_더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int val=0;
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			if(s%2!=0 && s%3==0) {
				val+=s;
			}
		}
		System.out.println(val);
	}

}
