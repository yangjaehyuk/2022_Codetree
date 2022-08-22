package 프로그래밍_연습;

import java.util.Scanner;
class bomb{
	String code;
	char color;
	int time;
	public bomb(String code, char color, int time) {
		this.code=code;
		this.color=color;
		this.time=time;
	}
}
public class 폭탄_해제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String code=sc.next();
		char color=sc.next().charAt(0);
		int time=sc.nextInt();
		bomb bomb1=new bomb(code,color,time);
		System.out.println("code "+": "+bomb1.code);
		System.out.println("color "+": "+bomb1.color);
		System.out.println("second "+": "+bomb1.time);
	}

}
