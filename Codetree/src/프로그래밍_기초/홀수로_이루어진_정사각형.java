package 프로그래밍_기초;

import java.util.Scanner;

public class 홀수로_이루어진_정사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((i*2+j*2+7)+" ");
			}
			System.out.println();
		}
	}

}
