package 프로그래밍_기초;

import java.util.Scanner;

public class 윤년_횟수_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(i%4==0 && (i%100!=0 || i%400==0)) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}

}
