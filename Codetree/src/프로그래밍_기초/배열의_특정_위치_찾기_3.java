package 프로그래밍_기초;

import java.util.Scanner;

public class 배열의_특정_위치_찾기_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[100];
		int k=0;
		for(int i=0;i<100;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0) {
				k=i;
				break;
			}
		}
		
		System.out.println(arr[k-3]+arr[k-2]+arr[k-1]);
	}

}
