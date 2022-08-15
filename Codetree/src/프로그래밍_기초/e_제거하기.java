package 프로그래밍_기초;

import java.util.Scanner;

public class e_제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char e='e';
		int idx=-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==e) {
				idx=i;
				break;
			}
			if(s.charAt(i)!=e) {
				System.out.print(s.charAt(i));
			}
		}
		for(int j=idx+1;j<s.length();j++) {
			System.out.print(s.charAt(j));
		}
	}

}
