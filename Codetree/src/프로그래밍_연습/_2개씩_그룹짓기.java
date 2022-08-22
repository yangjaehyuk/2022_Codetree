package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class _2개씩_그룹짓기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[2*n];
		for(int i=0;i<n*2;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr,0,2*n);
		int max=0;
		for(int i=0;i<n;i++) {
			int sum=arr[i]+arr[2*n-1-i];
			if(sum>max)
				max=sum;
		}
		System.out.println(max);
	}

}
