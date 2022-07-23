package 프로그래밍_기초;

import java.util.Scanner;

public class a나누기b_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int k=a/b;
		int l=a%b;
		int[] arr=new int[21];
		arr[0]=k;
		System.out.print(arr[0]+".");
		for(int i=1;i<21;i++) {
			int m=l*10/b;
			int n=l*10%b;
			arr[i]=m;
			System.out.print(arr[i]);
			l=n;
		}
	}

}
