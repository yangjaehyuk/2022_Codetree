package 프로그래밍_기초;

import java.util.Scanner;

public class 문자_제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		while(len>1) {
			int a=sc.nextInt();
			if(a>=len) {
				a=len-1;
			}
			s=s.substring(0, a)+s.substring(a+1);
			len--;
			System.out.println(s);
		}
	}

}
