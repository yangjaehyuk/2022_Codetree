package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_조건에_맞게_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[100];
		int zero=0;
		for(int i=0;i<100;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0)
			{
				zero=i;
				break;
			}
		}
		for(int i=0;i<zero;i++) {
			if(arr[i]%2!=0)
				System.out.print(arr[i]+3+" ");
			else
				System.out.print(arr[i]/2+" ");
		}
	}

}
