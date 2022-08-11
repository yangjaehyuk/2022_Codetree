package 프로그래밍_기초;

import java.util.Scanner;

public class 공백을_기준으로_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		a=a.replace(" ", "");
		b=b.replace(" ", "");
		System.out.print(a+b);
	}

}
