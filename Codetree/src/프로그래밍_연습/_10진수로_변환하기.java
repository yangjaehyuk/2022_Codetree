package 프로그래밍_연습;

import java.util.Scanner;
import java.util.stream.Stream;

public class _10진수로_변환하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] digit=Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		int num=0;
		for(int i=0;i<digit.length;i++) {
			num=num*2+digit[i];
		}
		System.out.println(num);
	}

}
