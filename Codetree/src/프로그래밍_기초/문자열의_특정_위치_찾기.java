package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열의_특정_위치_찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s=sc.next();
		char a=sc.next().charAt(0);
		int idx=-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				idx=i;
				break;
			}
			
		}
		if(idx==-1) {
			System.out.println("No");
		}
		else {
			System.out.println(idx);
		}
	}

}
