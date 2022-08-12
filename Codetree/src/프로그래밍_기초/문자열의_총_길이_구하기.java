package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열의_총_길이_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr=new String[10];
		int leng=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.next();
			leng+=arr[i].length();
		}
		System.out.println(leng);
	}

}
