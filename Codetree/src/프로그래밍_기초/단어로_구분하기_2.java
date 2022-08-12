package 프로그래밍_기초;

import java.util.Scanner;

public class 단어로_구분하기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr=new String[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<10;i+=2) {
			System.out.println(arr[i]);
		}
	}

}
