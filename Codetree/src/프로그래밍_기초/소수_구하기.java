package 프로그래밍_기초;

import java.util.Scanner;

public class 소수_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int cnt=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					cnt++;
					
				}
			}
			if(cnt==2)
				System.out.print(i+" ");
		}
	}	

}
