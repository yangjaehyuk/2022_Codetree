package 프로그래밍_기초;

import java.util.Scanner;

public class 구구단_만들기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=2;i<=8;i+=2) {
			for(int j=b;j>=a;j--) {
				if(j>=a) {
                    System.out.print(j + " * " + i + " = " + (i * j));
                    if(j != a)
                        System.out.print(" / ");
			}
			
		}
			System.out.println();
	}

	}
}
