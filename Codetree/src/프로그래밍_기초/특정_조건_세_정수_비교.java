package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_조건_세_정수_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<=b && a<=c) {
			System.out.print(1+" ");
		}
		else {
			System.out.print(0+" ");
		}
		if(a==b&&b==c) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
