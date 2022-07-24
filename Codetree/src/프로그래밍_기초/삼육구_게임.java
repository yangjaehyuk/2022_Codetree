package 프로그래밍_기초;

import java.util.Scanner;

public class 삼육구_게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.print(0+" ");
			}
			else if(i/10==3 || i/10==6 || i/10==9) {
				System.out.print(0+" ");
			}
			else if(i%3==0) {
				System.out.print(0+" ");
			}
			else {
				System.out.print(i+" ");
			}
		}
	}

}
