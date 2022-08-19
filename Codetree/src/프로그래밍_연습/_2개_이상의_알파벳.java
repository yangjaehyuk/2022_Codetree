package 프로그래밍_연습;

import java.util.Scanner;

public class _2개_이상의_알파벳 {
	public static void s(String s) {
		int cnt=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1))
				cnt++;
		}
		if(cnt>=1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		s(s);
	}

}
