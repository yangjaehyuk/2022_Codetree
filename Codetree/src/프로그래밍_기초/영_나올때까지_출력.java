package 프로그래밍_기초;

import java.util.Scanner;

public class 영_나올때까지_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			if(n>0) {
				System.out.println(n);
			}
			else {
				break;
			}
		}
	}

}
