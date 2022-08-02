package 프로그래밍_기초;

import java.util.Scanner;

public class 완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int cnt=0;
		for(int i=start;i<=end;i++) {
			int rst=0;
			for(int j=1;j<=i-1;j++) {
				if(i%j==0) {
					rst+=j;
				}
			}
			if(rst==i)
				cnt++;
				
		}
		System.out.print(cnt);

	}
}