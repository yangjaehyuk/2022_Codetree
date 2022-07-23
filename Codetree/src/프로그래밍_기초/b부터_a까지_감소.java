package 프로그래밍_기초;

import java.util.Scanner;

public class b부터_a까지_감소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=b;i>a-1;i--) {
			System.out.print(i+" ");
		}
	}

}
