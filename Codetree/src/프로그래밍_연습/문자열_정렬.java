package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

}
