package 프로그래밍_기초;

import java.util.Scanner;

public class 입력받은_값_교체하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		a=sc.nextInt();
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.printf("%d %d",a,b);
	}

}
