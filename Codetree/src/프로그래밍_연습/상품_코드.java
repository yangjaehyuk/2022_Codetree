package 프로그래밍_연습;

import java.util.Scanner;
class code{
	String name;
	int code;
	public code(){
		this.name="codetree";
		this.code=50;
	}
	public code(String name, int code) {
		this.name=name;
		this.code=code;
	}
}
public class 상품_코드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		int code=sc.nextInt();
		code code1=new code();
		System.out.println("product "+code1.code+" is "+code1.name);
		code1.name=name;
		code1.code=code;
		System.out.println("product "+code1.code+" is "+code1.name);
	}

}
