package 프로그래밍_연습;

import java.util.Scanner;

public class 선두를_지켜라 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[1000001];
		int[] b=new int[1000001];
		int cnt=0;
		int leader=0;
		int ta=1;
		for(int i=0;i<n;i++) {
			int v=sc.nextInt();
			int t=sc.nextInt();
			while(t-->0) {
				a[ta]=a[ta-1]+v;
				ta++;
			}
		}
		int tb=1;
		for(int i=0;i<m;i++) {
			int v=sc.nextInt();
			int t=sc.nextInt();
			while(t-->0) {
				b[tb]=b[tb-1]+v;
				tb++;
			}
		}
		for(int i=1;i<ta;i++) {
			if(a[i]>b[i]) {
				if(leader==2) {
					cnt++;
				}
				leader=1;
			}
			else if(a[i]<b[i]) {
				if(leader==1) {
					cnt++;
				}
				leader=2;
			}
		}
		
	System.out.println(cnt);
	}

}
