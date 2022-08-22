package 프로그래밍_연습;

import java.util.Scanner;

public class 재귀함수를_이용한_최댓값 {
	public static int max=0;
	public static int s(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(s(arr));
	}

}
