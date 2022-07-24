package 프로그래밍_기초;

import java.util.Scanner;

public class 숫자의_증감 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		int n = sc.nextInt();
		if(c.equals("A")) {
			for(int i=1;i<=n;i++) {
				System.out.print(i+" ");
			}
		}
		else {
			for(int i=n;i>=1;i--) {
				System.out.print(i+" ");
			}
		}
	}

}
