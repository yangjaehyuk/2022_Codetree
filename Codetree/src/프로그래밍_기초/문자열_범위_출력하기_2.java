package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_범위_출력하기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		int n=sc.nextInt();
		int cnt=0;
		for(int i=(int)a.length()-1;i>=0;i--) {
			if(cnt>=n)
				break;
			System.out.print(a.charAt(i));
			cnt++;
		}
	}

}
