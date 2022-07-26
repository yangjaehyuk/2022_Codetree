package 프로그래밍_기초;

import java.util.Scanner;

public class 조건에_따른_연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int n=0;
		while(true) {
			if(a>=1000) {
				System.out.println(n);
				break;
			}
			if(a%2==0) {
				a*=3;
				a++;
				n++;
			}
			else {
				a*=2;
				a+=2;
				n++;
			}
		}
	}

}
