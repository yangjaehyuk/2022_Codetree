package 프로그래밍_연습;

import java.util.Scanner;
class a{
	String s;
	String t;
	int n;
	public a(String s, String t, int n) {
		this.s=s;
		this.t=t;
		this.n=n;
	}
}
public class _007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int n=sc.nextInt();
		a a1=new a(s,t,n);
		System.out.println("secret code "+":"+" "+a1.s);
		System.out.println("meeting point "+":"+" "+a1.t);
		System.out.println("time "+":"+" "+a1.n);
	}

}
