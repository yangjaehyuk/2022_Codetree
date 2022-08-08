package 프로그래밍_기초;

import java.util.Scanner;

public class n개의_숫자_중_최소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int j=1;j<arr.length-1;j++) {
			if(arr[j]<min)
				min=arr[j];
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==min)
				cnt++;
		}
		System.out.print(min+" "+cnt);
	}

}
