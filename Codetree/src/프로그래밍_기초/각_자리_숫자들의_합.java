package 프로그래밍_기초;

import java.util.Scanner;

public class 각_자리_숫자들의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String s=Integer.toString(a);
		int total=0;
		for(int i=0;i<s.length();i++) {
			total+=s.charAt(i)-'0';
			
		}
		System.out.println(total);
	}

}
