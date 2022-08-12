package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열에서_문자_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		for(int i=0;i<a.length();i++){
			System.out.println(a.charAt(i));
		}
	}

}
