package 프로그래밍_기초;

import java.util.Scanner;

public class 전항의_두_배 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] arr=new int[10];
		arr[0]=a;
		arr[1]=b;
		System.out.print(arr[0]+" "+arr[1]+" ");
		for(int i=2;i<10;i++) {
			arr[i]=arr[i-1]+2*arr[i-2];
			System.out.print(arr[i]+" ");
		}
	}

}
