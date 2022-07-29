package 프로그래밍_기초;

import java.util.Scanner;

public class 규칙을_찾아_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==n) {
					System.out.print("*"+" ");
				}
				
				if((1<i && i<=n) && (1<=j && j<=n)) {
					if(i>j) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print("  ");
					}
				}
				
			}
			
			System.out.println();
		}
	}

}
