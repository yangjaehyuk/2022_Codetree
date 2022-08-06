package 프로그래밍_기초;

import java.util.Scanner;

public class 나눗셈의_나머지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		int[] count=new int[10];
		while(a>1) {
			count[a%b]++;
			a/=b;
		}
		for(int i=0;i<count.length;i++) {
			sum+=count[i]*count[i];
		}
		System.out.println(sum);
	}

}
