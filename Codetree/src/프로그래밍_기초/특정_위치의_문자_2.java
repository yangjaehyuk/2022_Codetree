package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_위치의_문자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] a=new char[10];
		for(int i=0;i<10;i++) {
			a[i]=sc.next().charAt(0);
		}
		System.out.print(a[1]+" "+a[4]+" "+a[7]);
	}

}
