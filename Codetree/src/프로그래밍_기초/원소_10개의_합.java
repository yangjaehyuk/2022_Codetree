package 프로그래밍_기초;

import java.util.Scanner;

public class 원소_10개의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			int a=sc.nextInt();
			arr[i]=a;
			sum+=arr[i];
		}
		System.out.println(sum);
		
	}

}
