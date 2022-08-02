package 프로그래밍_기초;

import java.util.Scanner;

public class 특이한_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)%4==0) {
					System.out.printf("(%d, %d) ",i,j);
					System.out.println();
				}
				else
					System.out.printf("(%d, %d) ",i,j);
					
			}
			
		}
	}

}
