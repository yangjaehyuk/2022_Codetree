package 프로그래밍_기초;

import java.util.Scanner;

public class 짝수_번째만_거꾸로_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String now="";
		String rev="";
		for(int i=1;i<a.length();i+=2) {
			now+=a.charAt(i);
		}
		for(int i=now.length()-1;i>=0;i--) {
			rev+=now.charAt(i);
		}
		System.out.println(rev);
	}

}
