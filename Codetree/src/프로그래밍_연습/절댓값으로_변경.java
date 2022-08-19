package 프로그래밍_연습;

import java.util.Scanner;

public class 절댓값으로_변경 {
	public static void s(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]*(-1)+" ");;
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
