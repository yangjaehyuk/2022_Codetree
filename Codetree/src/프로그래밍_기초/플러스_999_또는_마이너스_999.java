package 프로그래밍_기초;

import java.util.Scanner;

public class 플러스_999_또는_마이너스_999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[101];
		int k=0;
		int max=0;
		int min=1000;
		for(int i=0;i<100;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==999 || arr[i]==-999) {
				k=i;
				break;
			}
		}
		for(int i=0;i<k;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print(max+" "+min);
	}

}
