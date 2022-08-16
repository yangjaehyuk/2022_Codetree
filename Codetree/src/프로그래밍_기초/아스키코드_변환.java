package 프로그래밍_기초;

import java.util.Scanner;

public class 아스키코드_변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);
		int b=sc.nextInt();
		System.out.print((int)a+" "+(char)b);
	}

}
