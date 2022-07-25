package 프로그래밍_기초;

import java.util.Scanner;

public class 조건에_부합하는_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%2==0 && i%4!=0)
				continue;
			if((i/8)%2==0) {
				continue;
			}
			if((i%7)<4) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
