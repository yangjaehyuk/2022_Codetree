package 프로그래밍_기초;

import java.util.Scanner;

public class 배수의_개수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		for(int i=0;i<10;i++) {
			int n=sc.nextInt();
			if(n%2!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
