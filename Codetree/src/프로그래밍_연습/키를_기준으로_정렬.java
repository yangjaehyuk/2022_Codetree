package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;
class sort implements Comparable<sort>{
	String name;
	int height;
	int weight;
	public sort(String name, int height, int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public int compareTo(sort sort) {
		return this.height-sort.height;
	}
}
public class 키를_기준으로_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sort[] sort=new sort[n];
		for(int i=0;i<n;i++) {
			String name=sc.next();
			int height=sc.nextInt();
			int weight=sc.nextInt();
			sort[i]=new sort(name,height,weight);
		}
		Arrays.sort(sort);
		for(int i=0;i<n;i++) {
			System.out.println(sort[i].name+" "+sort[i].height+" "+sort[i].weight);
		}
	}

}
