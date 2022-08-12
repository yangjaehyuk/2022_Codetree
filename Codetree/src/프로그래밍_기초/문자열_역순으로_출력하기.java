package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_역순으로_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr=new String[4];
		for(int i=0;i<4;i++) {
			arr[i]=sc.next();
		}
		for(int i=3;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
