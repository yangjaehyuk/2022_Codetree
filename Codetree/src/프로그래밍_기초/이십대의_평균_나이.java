package 프로그래밍_기초;

import java.util.Scanner;

public class 이십대의_평균_나이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val=0;
		int cnt=0;
		while(true) {
			int n=sc.nextInt();
			if(n<30 && n>=20) {
				val+=n;
				cnt++;
			}
			else {
				System.out.printf("%.2f",(float)val/cnt);
				break;
			}
		}
	}

}
