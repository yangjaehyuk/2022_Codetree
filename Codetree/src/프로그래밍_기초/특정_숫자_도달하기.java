package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_숫자_도달하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr=new int[10];
		int sum=0;
		double cnt=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(arr[i]<250) {
				cnt++;
				sum+=arr[i];
			}
			else
				break;
		}
		System.out.print(sum+" ");
		System.out.printf("%.1f",sum/cnt);
	}

}
