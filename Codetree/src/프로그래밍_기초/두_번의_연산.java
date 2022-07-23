package 프로그래밍_기초;

import java.util.Scanner;

public class 두_번의_연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2!=0) {
			a+=3;
		}
		if(a%3==0) {
			a/=3;
		}
		System.out.println(a);
	}

}
