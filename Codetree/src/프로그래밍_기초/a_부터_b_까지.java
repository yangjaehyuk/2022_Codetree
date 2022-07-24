package 프로그래밍_기초;

import java.util.Scanner;

public class a_부터_b_까지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=a;i<=b;) {
			if(i%2==0) {
				System.out.print(i+" ");
				i+=3;
				
			}
			else {
				System.out.print(i+" ");
				i*=2;
				
			}
		}
	}

}
