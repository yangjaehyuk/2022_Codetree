package 프로그래밍_기초;

import java.util.Scanner;

public class ab_사이에_없는_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		boolean s=false;
		for(int i=a;i<=b;i++) {
			if(i%c==0) {
				s=true;
			}
		}
		if(s==true) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}

}
