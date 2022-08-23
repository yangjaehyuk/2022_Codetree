package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class personal{
	String name;
	int h;
	double w;
	public personal(String name, int h, double w) {
		this.name=name;
		this.h=h;
		this.w=w;
	}
}
public class 개인정보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		personal[] personal1=new personal[5];
		for(int i=0;i<5;i++) {
			String name=sc.next();
			int h=sc.nextInt();
			double w=sc.nextDouble();
			personal1[i]=new personal(name,h,w);
		}
		Arrays.sort(personal1, new Comparator<personal>() {

			@Override
			public int compare(personal o1, personal o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println("name");
		for(int i=0;i<5;i++) {
			System.out.println(personal1[i].name+" "+personal1[i].h+" "+personal1[i].w);
		}
		System.out.println();
		System.out.println("height");
		Arrays.sort(personal1, new Comparator<personal>() {

			@Override
			public int compare(personal o1, personal o2) {
				// TODO Auto-generated method stub
				return o2.h-o1.h;
			}
			
		});
		for(int i=0;i<5;i++) {
			System.out.println(personal1[i].name+" "+personal1[i].h+" "+personal1[i].w);
		}
	}

}
