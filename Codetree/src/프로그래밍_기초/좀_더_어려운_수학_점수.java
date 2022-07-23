package 프로그래밍_기초;

import java.util.Scanner;

public class 좀_더_어려운_수학_점수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a_math, a_eng;
		a_math=sc.nextInt();
		a_eng=sc.nextInt();
		int b_math, b_eng;
		b_math=sc.nextInt();
		b_eng=sc.nextInt();
		if(a_math>b_math) {
			System.out.println("A");
		}
		else if(b_math>a_math) {
			System.out.println("B");
		}
		else if(a_math==b_math) {
			if(a_eng>b_eng) {
				System.out.println("A");
			}
			else {
				System.out.println("B");
			}
		}
	}

}
