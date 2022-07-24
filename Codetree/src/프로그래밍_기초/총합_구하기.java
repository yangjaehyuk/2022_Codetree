package 프로그래밍_기초;

import java.util.Scanner;

public class 총합_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int val=0;
		for(int i=a;i<=b;i++) {
			if(i%6==0 && i%8!=0) {
				val+=i;
			}
		}
		System.out.println(val);
	}

}
