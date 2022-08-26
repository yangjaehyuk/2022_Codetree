package 프로그래밍_연습;

import java.util.Scanner;

public class 만나는_그_순간 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[1000001];
		int[] b=new int[1000001];
		int ta=1;
		for(int i=0;i<n;i++) {
			char d=sc.next().charAt(0);
			int t=sc.nextInt();
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
			char d=sc.next().charAt(0);
			int t=sc.nextInt();
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
		int ans=-1;
		
		for(int i=1;i<ta;i++) {
			if(a[i]==b[i]) {
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}

}
