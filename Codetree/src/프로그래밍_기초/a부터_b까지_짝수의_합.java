package 프로그래밍_기초;

import java.util.Scanner;

public class a부터_b까지_짝수의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int val=0;
		if(a>b) {
			for(int i=b;i<=a;i++) {
				if(i%2==0) {
					val+=i;
				}
			}
		}
		else {
			for(int i=a;i<=b;i++) {
				if(i%2==0) {
					val+=i;
				}
			}
		}
		System.out.println(val);
	}

}
