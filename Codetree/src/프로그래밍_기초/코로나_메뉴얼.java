package 프로그래밍_기초;

import java.util.Scanner;

public class 코로나_메뉴얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=0;
		String a_cold;
		int a_tem;
		a_cold=sc.next();
		a_tem=sc.nextInt();
		String b_cold;
		int b_tem;
		b_cold=sc.next();
		b_tem=sc.nextInt();
		String c_cold;
		int c_tem;
		c_cold=sc.next();
		c_tem=sc.nextInt();
		if(a_cold.equals("Y") && a_tem>=37) {
			A+=1;
		}
		else {
			A+=0;
		}
		if(b_cold.equals("Y") && b_tem>=37) {
			A+=1;
		}
		else {
			A+=0;
		}
		if(c_cold.equals("Y") && c_tem>=37) {
			A+=1;
		}
		else {
			A+=0;
		}
		if(A>=2) {
			System.out.println("E");
		}
		else {
			System.out.println("N");
		}
	}

}
