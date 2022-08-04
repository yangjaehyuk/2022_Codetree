package 프로그래밍_기초;

import java.util.Scanner;

public class 배열의_특정_위치_찾기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int h=0;
		int j=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i+=2) {
			h+=arr[i];
		}
		for(int i=1;i<=10;i+=2) {
			j+=arr[i];
		}
		if(h>=j) {
			System.out.println(h-j);
		}
		else
			System.out.println(j-h);
	}

}
