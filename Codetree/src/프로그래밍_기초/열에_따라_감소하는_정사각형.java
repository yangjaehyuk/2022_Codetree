package 프로그래밍_기초;

import java.util.Scanner;

public class 열에_따라_감소하는_정사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
