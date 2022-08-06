package 프로그래밍_기초;

import java.util.Scanner;

public class 일_구_개수_세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[100];
		int[] countarr=new int[10];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			countarr[arr[i]]++;
		}
		for(int i=1;i<=9;i++) {
			System.out.println(countarr[i]);
		}
	}

}
