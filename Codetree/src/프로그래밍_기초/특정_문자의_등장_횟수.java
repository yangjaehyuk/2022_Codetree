package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_문자의_등장_횟수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int cnt1=0;
		int cnt2=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='e' && s.charAt(i+1)=='e') {
				cnt1++;
			}
		}
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='e' && s.charAt(i+1)=='b') {
				cnt2++;
			}
		}
		System.out.println(cnt1+" "+cnt2);
	}

}
