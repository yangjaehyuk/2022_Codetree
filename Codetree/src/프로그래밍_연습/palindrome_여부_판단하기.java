package 프로그래밍_연습;

import java.util.Scanner;

public class palindrome_여부_판단하기 {
	public static boolean palindrome(String s) {
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		if(palindrome(s)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
