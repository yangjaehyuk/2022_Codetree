package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class 정수의_최솟값 {
	public static int s(int a,int b,int c) {
		int[] arr=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		Arrays.sort(arr);
		return arr[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(s(a,b,c));
	}

}
