package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_조건_두_정수_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b) {
			System.out.print(1+" ");
		}
		else {
			System.out.print(0+" ");
		}
		if(a==b) {
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}
	}

}
