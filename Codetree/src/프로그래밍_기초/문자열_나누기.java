package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_나누기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr=new String[10];
		String all="";
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			all+=arr[i];
		}
		int len=all.length();
		for(int i=0;i<len;i++) {
			System.out.print(all.charAt(i));
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}

}
