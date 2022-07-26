package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_숫자_맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			if(n>25) {
				System.out.println("Lower");
			}
			else if(n==25) {
				System.out.println("Good");
				break;
			}
			else {
				System.out.println("Higher");
			}
		}
	}

}
