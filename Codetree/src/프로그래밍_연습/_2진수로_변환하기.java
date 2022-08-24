package 프로그래밍_연습;

import java.util.Scanner;

public class _2진수로_변환하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] digit=new int[20];
		int cnt=0;
		while(true) {
			if(n<2) {
				digit[cnt++]=n;
				break;
			}
			
			digit[cnt++]=n%2;
			n/=2;
		}
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(digit[i]);
		}
	}

}
