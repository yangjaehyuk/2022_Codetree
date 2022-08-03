package 프로그래밍_기초;

import java.util.Scanner;

public class 열개_입력받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int cnt=0;
		int sum=0;
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			n=sc.nextInt();
			if(n==0) {
				break;
			}
			else {
				arr[i]=n;
				cnt++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.printf("%d %.1f",sum,(double)sum/cnt);
	}

}
