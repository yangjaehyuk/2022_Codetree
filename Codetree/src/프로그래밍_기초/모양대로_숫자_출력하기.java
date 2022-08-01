package 프로그래밍_기초;

import java.util.Scanner;

public class 모양대로_숫자_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(j>i)
					System.out.print("  ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
