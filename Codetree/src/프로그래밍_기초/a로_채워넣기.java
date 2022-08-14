package 프로그래밍_기초;

import java.util.Scanner;

public class a로_채워넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		a=a.substring(0, 1)+"a"+a.substring(2);
		a=a.substring(0, a.length()-2)+"a"+a.substring(a.length()-1);
		System.out.println(a);
	}

}
