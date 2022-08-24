package 프로그래밍_연습;

import java.util.Scanner;

public class 여러가지_진수변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int[] digit=new int[20];
		int cnt=0;
		while(true) {
			if(n<b) {
				digit[cnt++]=n;
				break;
				
			}
			digit[cnt++]=n%b;
			n/=b;
		}
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(digit[i]);
		}
	}

}
