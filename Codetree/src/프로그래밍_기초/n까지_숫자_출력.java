package 프로그래밍_기초;

import java.util.Scanner;

public class n까지_숫자_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			i++;
		}
	}

}
