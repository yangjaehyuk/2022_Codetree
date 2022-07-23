package 프로그래밍_기초;

import java.util.Scanner;

public class 범위_안의_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=10 && a<=20) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
