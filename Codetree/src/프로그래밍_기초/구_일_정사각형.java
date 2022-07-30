package 프로그래밍_기초;

import java.util.Scanner;

public class 구_일_정사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(cnt);
				if(cnt>1)
					cnt--;
				else
					cnt=9;
			}
			System.out.println();
		}
	}

}
