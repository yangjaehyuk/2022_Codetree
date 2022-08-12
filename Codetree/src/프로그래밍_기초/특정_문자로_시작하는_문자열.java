package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_문자로_시작하는_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		int leng=0;
		int cnt=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		char a=sc.next().charAt(0);
		for(int i=0;i<n;i++) {
			if(arr[i].charAt(0)==a) {
				leng+=arr[i].length();
				cnt++;
			}
		}
		System.out.printf("%d %.2f",cnt,(double)leng/cnt);
	}

}
