package 프로그래밍_기초;

import java.util.Scanner;

public class 숫자_피라미드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
	}

}
