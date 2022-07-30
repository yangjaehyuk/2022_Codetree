package 프로그래밍_기초;

import java.util.Scanner;

public class 모양대로_숫자_출력하기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(cnt+" ");
				if(cnt<8)
					cnt+=2;
				else
					cnt=2;
			}
			System.out.println();
		}
	}

}
