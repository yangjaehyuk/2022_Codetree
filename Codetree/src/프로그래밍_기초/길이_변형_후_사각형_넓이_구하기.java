package 프로그래밍_기초;

import java.util.Scanner;

public class 길이_변형_후_사각형_넓이_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row, column;
		row=sc.nextInt();
		column=sc.nextInt();
		int r_row=row+8;
		int r_column=column*3;
		System.out.println(r_row);
		System.out.println(r_column);
		System.out.println(r_row*r_column);
	}

}
