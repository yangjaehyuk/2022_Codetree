package 프로그래밍_연습;

import java.util.Scanner;
class live{
	String name;
	String num;
	String city;
	public live(String name, String num, String city) {
		this.name=name;
		this.num=num;
		this.city=city;
	}
}
public class 사는_지역 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		live[] live=new live[n];
		for(int i=0;i<n;i++) {
			String name=sc.next();
			String num=sc.next();
			String city=sc.next();
			live[i]=new live(name,num,city);
		}
		int last=0;
		for(int i=0;i<live.length;i++) {
			if(live[i].name.compareTo(live[last].name)>0) {
				last=i;
			}
		}
		System.out.println("name "+live[last].name);
		System.out.println("addr "+live[last].num);
		System.out.println("city "+live[last].city);
	}

}
