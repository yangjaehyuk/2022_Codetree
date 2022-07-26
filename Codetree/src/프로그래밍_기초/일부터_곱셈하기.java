package 프로그래밍_기초;

import java.util.Scanner;

public class 일부터_곱셈하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1;
		for(int i=1;i<=10;i++) {
			prod*=i;
			if(prod>=n) {
				System.out.print(i);
				break;
			}
		}
	}

}
