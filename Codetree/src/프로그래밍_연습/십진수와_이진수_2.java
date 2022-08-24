package 프로그래밍_연습;

import java.util.Scanner;
import java.util.stream.Stream;

public class 십진수와_이진수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] digit=Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		int num=0;
		int cnt=0;
		int[] binary=new int[20];
		for(int i=0;i<digit.length;i++) {
			num=num*2+digit[i];
		}
		num*=17;
		while(true) {
			if(num<2) {
				binary[cnt++]=num;
				break;
			}
			binary[cnt++]=num%2;
			num/=2;
		}
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
	}

}
