package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_규칙에_따른_숫자_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=1;
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(j>i) 
					System.out.print("  ");
				else{
					if(cnt<10) {
						System.out.print(cnt+" ");
						cnt++;
				
						
					}
					else {
						cnt=1;
						System.out.print(cnt+" ");
						cnt++;
						
					}
				}
					
			}
			System.out.println();
		}
	}

}
