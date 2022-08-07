package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_위치의_문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr=new char[] {'L','E','B','R','O','S'};
		char a=sc.next().charAt(0);
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(a==arr[i]) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("None");
		}
		else {
			System.out.println(index);
		}
	}

}
