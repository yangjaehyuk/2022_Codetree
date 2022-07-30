package 프로그래밍_기초;

import java.util.Scanner;

public class 정사각형_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
	}

}
