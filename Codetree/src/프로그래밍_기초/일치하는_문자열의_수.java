package 프로그래밍_기초;

import java.util.Scanner;

public class 일치하는_문자열의_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String a=sc.next();
		int cnt=0;
		for(int i=0;i<n;i++) {
			String b=sc.next();
			if(a.equals(b)) {
				cnt++;
			}
			else {
				continue;
			}
		}
		System.out.println(cnt);
	}

}
