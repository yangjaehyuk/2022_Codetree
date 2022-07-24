package 프로그래밍_기초;

import java.util.Scanner;

public class 백부터_입력받는_수까지의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int val=0;
		for(int i=n;i<=100;i++) {
			val+=i;
		}
		System.out.println(val);
	}

}
