package 프로그래밍_기초;

import java.util.Scanner;

public class 홀수만_출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i>b-1;i-=2) {
			System.out.print(i+" ");
		}
	}

}
