package 프로그래밍_연습;

import java.util.Scanner;

public class 나누고_빼면서_합하기 {
	public static void s(int[] arr, int m) {
		int total=0;
		total+=arr[m-1];
		while(true) {
			if(m==1)
				break;
			if(m%2==0) {
				m/=2;
				total+=arr[m-1];
			}
			else {
				m-=1;
				total+=arr[m-1];
			}
		}
		System.out.println(total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		s(arr, m);
	}

}
