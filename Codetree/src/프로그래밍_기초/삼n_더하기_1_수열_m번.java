package 프로그래밍_기초;

import java.util.Scanner;

public class 삼n_더하기_1_수열_m번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int cnt=0;
			int a=sc.nextInt();
			while(true) {
				if(a==1) {
					System.out.println(cnt);
					break;
				}
				if(a%2!=0) {
					a*=3;
					a++;
					cnt++;
				}
				else {
					a/=2;
					cnt++;
					
				}			
			}
		}
		
	}

}
