package 프로그래밍_기초;

import java.util.Scanner;

public class 규칙에_맞는_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			
			for(int j=n;j>=1;j--) {
				if(j<i){
					System.out.print("  ");
				}
				else {
					System.out.print(i+j-2*j+n+" ");
					
				}
			}
			System.out.println();
		}
	}

}
