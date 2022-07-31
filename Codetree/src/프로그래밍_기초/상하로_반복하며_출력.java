package 프로그래밍_기초;

import java.util.Scanner;

public class 상하로_반복하며_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j%2!=0) {
					System.out.print(i);
				}
				else {
					System.out.print(n-i+1);
				}
			}
			System.out.println();
		}
	}

}
