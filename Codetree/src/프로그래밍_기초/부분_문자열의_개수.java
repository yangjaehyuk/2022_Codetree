package 프로그래밍_기초;

import java.util.Scanner;

public class 부분_문자열의_개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int cnt=0;
		for(int i=0;i<a.length()-1;i++) {
			if(a.charAt(i)==b.charAt(0) && a.charAt(i+1)==b.charAt(1)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
