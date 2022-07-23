package 프로그래밍_기초;

import java.util.Scanner;

public class 최대_2번의_계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			a/=2;
		}
		if(a%2!=0) {
			a+=1;
			a/=2;
		}
		System.out.println(a);
	}

}
