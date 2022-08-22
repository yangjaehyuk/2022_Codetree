package 프로그래밍_연습;

import java.util.Scanner;

class level{
	String s;
	int n;
	public level() {
		this.s="codetree";
		this.n=10;
		
	}
	public level(String s, int n){
		this.s=s;
		this.n=n;
	}
}
public class Next_Level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		level level1=new level();
		System.out.println("user "+level1.s+" lv "+level1.n);
		level1.s=s;
		level1.n=n;
		System.out.println("user "+level1.s+" lv "+level1.n);
		

	}
}
