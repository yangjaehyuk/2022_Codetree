package 프로그래밍_기초;

import java.util.Arrays;
import java.util.Scanner;

public class 가장_짧은_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.next().length();
		}
		Arrays.sort(arr);
		System.out.println(arr[2]-arr[0]);
	}

}
