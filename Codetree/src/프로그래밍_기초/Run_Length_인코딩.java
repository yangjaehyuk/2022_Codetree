package 프로그래밍_기초;

import java.util.Scanner;

public class Run_Length_인코딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String encod="";
		char b=a.charAt(0);
		int cnt=1;
		for(int i=1;i<a.length();i++) {
			if(b==a.charAt(i)) {
				cnt++;
			}
			else {
				encod+=b;
				encod+=Integer.toString(cnt);
				b=a.charAt(i);
				cnt=1;
			}
		}
		encod+=b;
		encod+=Integer.toString(cnt);
		System.out.println(encod.length());
		System.out.println(encod);
	}

}
