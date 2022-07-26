package 프로그래밍_기초;

import java.util.Scanner;

public class 공약수의_유무 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		boolean s=false;
		for(int i=a;i<=b;i++) {
			if(1920%i==0 && 2880%i==0) {
				s=true;
			}
		}
		if(s==true) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
