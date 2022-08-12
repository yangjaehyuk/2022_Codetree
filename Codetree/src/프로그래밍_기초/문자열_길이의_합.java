package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_길이의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		int leng=0;
		int cnt=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
			leng+=arr[i].length();
		}
		for(int i=0;i<n;i++) {
			if(arr[i].charAt(0)=='a') {
				cnt++;
			}
		}
		System.out.println(leng+" "+cnt);
	}

}
