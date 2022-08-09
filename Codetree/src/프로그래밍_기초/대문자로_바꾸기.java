package 프로그래밍_기초;

import java.util.Scanner;

public class 대문자로_바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				String a=sc.next();
				a=a.toUpperCase();
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
