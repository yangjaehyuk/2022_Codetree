package 프로그래밍_기초;

import java.util.Scanner;

public class 몫_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		while(true) {
			int n=sc.nextInt();
			if(n%2!=0) {
				continue;
			}
			else {
				n/=2;
				System.out.println(n);
				cnt++;
			}
			if(cnt==3) {
				break;
			}
		}
	}

}
