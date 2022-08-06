package 프로그래밍_기초;

import java.util.Scanner;

public class 백_도달하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[100];
		arr[0]=1;
		arr[1]=n;
		System.out.print(arr[0]+" "+arr[1]+" ");
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			if(arr[i]>100) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
