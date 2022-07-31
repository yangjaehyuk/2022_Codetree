package 프로그래밍_기초;

import java.util.Scanner;

public class 좌우로_반복하며_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				for(int j=1;j<=n;j++) {
					System.out.print(j);
				}
			}
			else {
				for(int j=n;j>=1;j--) {
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
	}

}
