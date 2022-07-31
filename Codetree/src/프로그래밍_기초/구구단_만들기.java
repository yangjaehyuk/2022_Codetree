package 프로그래밍_기초;

import java.util.Scanner;

public class 구구단_만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<=9;i++) {
			for(int j=b;j>=a;j--) {
				if(j % 2 == 0) {
                    System.out.print(j + " * " + i + " = " + (i * j));
                    if(j != a && j != a + 1)
                        System.out.print(" / ");
                }
            }
            System.out.println();
		}
	}

}
