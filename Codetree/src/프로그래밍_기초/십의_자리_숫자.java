package 프로그래밍_기초;

import java.util.Scanner;

public class 십의_자리_숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[100];
		int[] count=new int[10];
		for(int i=0;i<100;i++) {
			arr[i]=sc.nextInt();
			count[arr[i]/10]++;
			if(arr[i]==0) {
				break;
			}
		}
		for(int i=1;i<=9;i++) {
			System.out.println(i+" - "+count[i]);
		}
	}

}
