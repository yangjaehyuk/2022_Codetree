package 프로그래밍_기초;

import java.util.Scanner;

public class 물의_상태 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int water=sc.nextInt();
		if(water<0) {
			System.out.println("ice");
		}
		else if(0<=water && water<100) {
			System.out.println("water");
		}
		else {
			System.out.println("vapor");
		}
	}

}
