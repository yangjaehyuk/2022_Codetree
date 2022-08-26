package 프로그래밍_연습;

import java.util.Scanner;

public class 좌우로_움직이는_로봇 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[1000001];
		int b[]=new int[1000001];
		int cnt=0;
		int ta=1;
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			char d=sc.next().charAt(0);
			while(t-->0) {
				if(d=='R') {
					a[ta]=a[ta-1]+1;
				}
				else {
					a[ta]=a[ta-1]-1;
				}
				ta++;
			}
		}
		int tb=1;
		for(int i=0;i<m;i++) {
			int t=sc.nextInt();
			char d=sc.next().charAt(0);
			while(t-->0) {
				if(d=='R') {
					b[tb]=b[tb-1]+1;
				}
				else {
					b[tb]=b[tb-1]-1;
				}
				tb++;
			}
		}
		if(ta<tb) {
			for(int i=ta;i<tb;i++) {
				a[i]=a[i-1];			
			}
		}
		else if(ta>tb) {
			for(int i=tb;i<ta;i++) {
				b[i]=b[i-1];
			}
			
		}
		if(ta>tb) {
			for(int i=1;i<ta;i++) {
				if(a[i]==b[i] && (a[i-1]!=b[i-1])) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		else if(tb>ta) {
			for(int i=1;i<tb;i++) {
				if(a[i]==b[i] && (a[i-1]!=b[i-1])) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
