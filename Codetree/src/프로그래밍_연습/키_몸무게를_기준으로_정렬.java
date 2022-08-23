package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;
class hw implements Comparable<hw>{
	String name;
	int h,w;
	public hw(String name, int h, int w) {
		this.name=name;
		this.h=h;
		this.w=w;
	}
	public int compareTo(hw hw) {
		if(hw.h!=this.h)
			return this.h-hw.h;
		return hw.w-this.w;
	}
}
public class 키_몸무게를_기준으로_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		hw[] hw=new hw[n];
		for(int i=0;i<n;i++) {
			String name=sc.next();
			int h=sc.nextInt();
			int w=sc.nextInt();
			hw[i]=new hw(name,h,w);
		}
		Arrays.sort(hw,0,n);
		for(int i=0;i<n;i++) {
			System.out.println(hw[i].name+" "+hw[i].h+" "+hw[i].w);
		}
	}

}
