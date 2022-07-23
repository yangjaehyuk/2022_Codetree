package 프로그래밍_기초;

import java.util.Scanner;

public class 시험_통과_여부_확인하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=80) {
			System.out.println("pass");
		}
		else {
			int rst=80-n;
			System.out.printf("%d more score",rst);
		}
	}

}
