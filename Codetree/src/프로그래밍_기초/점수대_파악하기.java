package 프로그래밍_기초;

import java.util.Scanner;

public class 점수대_파악하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] count=new int[11];
		int[] arr=new int[100];
		for(int i=0;i<100;i++) {
			arr[i]=sc.nextInt();
			count[arr[i]/10]++;
			if(arr[i]==0)
				break;
			
		}
		for(int i=10;i>=1;i--) {
			System.out.println(i*10+" - "+count[i]);
		}
	}

}
