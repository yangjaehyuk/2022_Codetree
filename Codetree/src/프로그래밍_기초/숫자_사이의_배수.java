package 프로그래밍_기초;

import java.util.Scanner;

public class 숫자_사이의_배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		int cnt=0;
		int val=0;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%5==0) {
				val+=i;
				cnt++;
			}
			else if(i%7==0) {
				val+=i;
				cnt++;
			}
		}
		System.out.printf("%d %.1f", val, (float)val/cnt);
	}

}
