package 프로그래밍_기초;

import java.util.Scanner;

public class 오백_근처의_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int[] a=new int[10];
		int[] b=new int[10];
		int max=0;
		int min=1000;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(arr[i]<500) {
				a[i]=arr[i];
			}
			else {
				b[i]=arr[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=0) {
				if(min>b[i]) {
					min=b[i];
				}
			}
		}
		System.out.print(max+" "+min);
		
	}

}
