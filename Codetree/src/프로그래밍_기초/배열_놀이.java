package 프로그래밍_기초;

import java.util.Scanner;

public class 배열_놀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[100];
		int[] same=new int[100];
		int cnt=0;
		int n=sc.nextInt();
		int q=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++) {
			int a=sc.nextInt();
			if(a==1) {
				int b=sc.nextInt();
				System.out.println(arr[b-1]);
			}
			else if(a==2) {
				int c=sc.nextInt();
				int idx=-1;
				for(int j=0;j<n;j++) {
					if(arr[j]==c) {
					idx=j;
					break;	
						}
					}
				System.out.println(idx+1);
				}
			else{
				int d=sc.nextInt();
				int e=sc.nextInt();
				for(int j=d-1;j<e;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
	}
}

