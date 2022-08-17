package 프로그래밍_기초;

import java.util.Scanner;

public class 합을_옆으로_밀어_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			total+=k;
		}
		String s=Integer.toString(total);
		s=s.substring(1)+s.substring(0,1);
		System.out.println(s);
	}

}
