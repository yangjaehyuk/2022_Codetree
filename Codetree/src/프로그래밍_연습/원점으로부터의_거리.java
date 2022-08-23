package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;
class dist implements Comparable<dist>{
	int d,num;
	public dist(int d,int num) {
		this.d=d;
		this.num=num;
	}
	public int compareTo(dist dist) {
		if(this.d!=dist.d)
			return this.d-dist.d;
		return this.num-dist.num;
	}
	
}
public class 원점으로부터의_거리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		dist[] dist=new dist[n];
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x<0)
				x*=-1;
			if(y<0)
				y*=-1;
			int d=x+y;
			dist[i]=new dist(d,i+1);
		}
		Arrays.sort(dist,0,n);
		for(int i=0;i<n;i++) {
			System.out.println(dist[i].num);
		}
	}

}
