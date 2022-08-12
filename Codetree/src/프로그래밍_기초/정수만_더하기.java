package 프로그래밍_기초;

import java.util.Scanner;

public class 정수만_더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arr;
		arr=sc.next();
		int total=0;
		for(int i=0;i<arr.length();i++) {
			if(arr.charAt(i)>='0' && arr.charAt(i)<='9')
				total+=(arr.charAt(i)-'0');
		}
		System.out.println(total);
	}

}
