package 프로그래밍_연습;

import java.util.Scanner;

public class 왔다_갔던_구역_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start=100;
		int[] arr=new int[1001];
		int[] x1=new int[1001];
		int[] x2=new int[1001];
		int[] checked=new int[2001];
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int line=sc.nextInt();
			char dir=sc.next().charAt(0);
			if(dir=='R') {
				x1[i]=start-line;
				x2[i]=start;
				start-=line;
			}
			else if(dir=='L') {
				x1[i]=start;
				x2[i]=start+line;
				start+=line;
			}
			x1[i]+=100;
			x2[i]+=100;
		}
		for(int i=0;i<n;i++) {
			for(int j=x1[i];j<x2[i];j++) {
				checked[j]++;
			}
		}
		int cnt=0;
		for(int i=0;i<2001;i++) {
			if(checked[i]>=2)
				cnt++;
		}
		System.out.println(cnt);
	}

}
