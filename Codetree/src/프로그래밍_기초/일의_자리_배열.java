package 프로그래밍_기초;

import java.util.Scanner;

public class 일의_자리_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[11];
		int a=sc.nextInt();
		int b=sc.nextInt();
		arr[1]=a;
		arr[2]=b;
		System.out.print(arr[1]+" "+arr[2]+" ");
		for(int i=3;i<11;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			System.out.print(arr[i]%10+" ");
		}
	}

}
