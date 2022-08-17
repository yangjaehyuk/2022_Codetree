package 프로그래밍_기초;

import java.util.Scanner;

public class 두_수의_합과_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		String s=Integer.toString(c);
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1')
				cnt++;
		}
		System.out.println(cnt);
	}

}
