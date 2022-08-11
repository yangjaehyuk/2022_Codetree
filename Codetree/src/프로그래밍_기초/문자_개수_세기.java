package 프로그래밍_기초;

import java.util.Scanner;

public class 문자_개수_세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		char b=sc.next().charAt(0);
		int cnt=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
