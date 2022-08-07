package 프로그래밍_기초;

import java.util.Scanner;

public class 연속부분수열일까 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] a=new int[n1+1];
		int[] b=new int[n2+1];
		for(int i=0;i<n1;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n2;j++) {
			b[j]=sc.nextInt();
		}
		for(int i=0;i<n1;i++) {
			boolean t=true;
			for(int j=0;j<n2;j++) {
				if(i+j>=n1) {
					t=false;
					break;
				}
				if(a[i+j]!=b[j]) {
					t=false;
					break;
				}
			}
			if(t) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}

}
