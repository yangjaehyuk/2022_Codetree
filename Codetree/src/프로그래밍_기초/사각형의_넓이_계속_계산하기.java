package 프로그래밍_기초;

import java.util.Scanner;

public class 사각형의_넓이_계속_계산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a,b;
			String c;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.next();
			if(c.equals("C")){
				System.out.println(a*b);
				break;
			}
			else {
				System.out.println(a*b);
			}
		}
	}

}
