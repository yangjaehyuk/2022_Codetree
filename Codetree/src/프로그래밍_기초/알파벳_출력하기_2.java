package 프로그래밍_기초;

import java.util.Scanner;

public class 알파벳_출력하기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<i)
					System.out.print("  ");
				else {
					System.out.print((char)a+" ");
					a++;
					if(a>90)
						a=65;
				}
			}
			System.out.println();
		}
	}

}
