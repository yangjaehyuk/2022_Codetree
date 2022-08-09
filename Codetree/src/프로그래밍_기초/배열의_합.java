package 프로그래밍_기초;

import java.util.Scanner;

public class 배열의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int sum=0;
			int a=0;
			for(int j=0;j<4;j++) {
				a=sc.nextInt();
				sum+=a;
			}
			System.out.println(sum);
		}
	}

}
