package 프로그래밍_기초;

import java.util.Scanner;

public class 가장_왼쪽에_있는_최댓값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int pre=n;
		while(true) {
			int max=0;
			for(int j=0;j<pre;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			System.out.print((max+1)+" ");
			if(max==0)
				break;
			pre=max;
		}
	}

}
