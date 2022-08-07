package 프로그래밍_기초;

import java.util.Scanner;

public class 개수_세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr = new int[100];
		int cnt=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(m==arr[i])
				cnt++;
		}
		System.out.println(cnt);
	}

}
