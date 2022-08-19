package 프로그래밍_연습;

import java.util.Scanner;

public class 짝수만_2로_나누기 {
	public static int n;
	public static void s(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[i]=arr[i]/2;
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		s(arr);
	}
}
