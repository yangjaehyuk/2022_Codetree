package 프로그래밍_기초;

import java.util.Scanner;

public class 미는_횟수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int cnt=0;
		for(int i=0;i<a.length();i++) {
			if(a.equals(b)) {
				System.out.println(cnt);
				break;
			}
			else {
				a=a.substring(a.length()-1)+a.substring(0,a.length()-1);
				cnt++;
				if(cnt>=a.length()) {
					System.out.println(-1);
					break;
				}
			}
		}
	}

}
