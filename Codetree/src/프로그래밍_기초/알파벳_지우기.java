package 프로그래밍_기초;

import java.util.Scanner;

public class 알파벳_지우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String rep_a=a.replaceAll("[^0-9]", "");
		String rep_b=b.replaceAll("[^0-9]", "");
		int s=Integer.parseInt(rep_a);
		int c=Integer.parseInt(rep_b);
		System.out.println(s+c);
	}

}
