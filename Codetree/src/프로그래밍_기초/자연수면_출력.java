package 프로그래밍_기초;

import java.util.Scanner;

public class 자연수면_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>0) {
			for(int i=0;i<b;i++) {
				System.out.print(a);
			}
		}
		else {
			System.out.println(0);
		}
	}

}
