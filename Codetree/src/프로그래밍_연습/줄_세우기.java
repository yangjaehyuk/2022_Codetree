package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;
class line implements Comparable<line>{
	int h;
	int w;
	int num;
	public line(int h, int w, int num) {
		this.h=h;
		this.w=w;
		this.num=num;
	}
	public int compareTo(line line) {
		if(this.h!=line.h)
			return line.h-this.h;
		if(this.w!=line.w)
			return line.w-this.w;
		return this.num-line.num;
	}
}
public class 줄_세우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		line[] line=new line[n];
		for(int i=0;i<n;i++) {
			int h=sc.nextInt();
			int w=sc.nextInt();
			line[i]=new line(h,w,i+1);
		}
		Arrays.sort(line);
		for(int i=0;i<n;i++) {
			System.out.println(line[i].h+" "+line[i].w+" "+line[i].num);
		}
	}

}
