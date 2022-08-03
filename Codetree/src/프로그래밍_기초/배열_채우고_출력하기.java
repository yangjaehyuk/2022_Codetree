package 프로그래밍_기초;

import java.util.Scanner;

public class 배열_채우고_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char [] arr=new char[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.next().charAt(0);
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}

}
