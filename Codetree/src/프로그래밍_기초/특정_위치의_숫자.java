package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_위치의_숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		sum+=arr[2]+arr[4]+arr[9];
		System.out.println(sum);
	}

}
