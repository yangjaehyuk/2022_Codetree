package 프로그래밍_기초;

import java.util.Scanner;

public class 규칙에_따라_밀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String command=sc.next();
		for(int i=0;i<command.length();i++) {
			if(command.charAt(i)=='L') {
				s=s.substring(1)+s.substring(0,1);
			}
			else {
				s=s.substring(s.length()-1)+s.substring(0,s.length()-1);
			}
		}
		System.out.println(s);
	}

}
