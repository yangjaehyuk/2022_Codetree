package 프로그래밍_기초;

import java.util.Arrays;
import java.util.Scanner;

public class n개의_숫자_중_최대_2개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[arr.length-1]+" "+arr[arr.length-2]);
		
	}

}
