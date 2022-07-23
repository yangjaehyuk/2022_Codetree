package 프로그래밍_기초;

import java.util.Scanner;

public class 점수_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a_math,a_eng;
		a_math=sc.nextInt();
		a_eng=sc.nextInt();
		int b_math,b_eng;
		b_math=sc.nextInt();
		b_eng=sc.nextInt();
		if(a_math>b_math && a_eng>b_eng) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}

}
