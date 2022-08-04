package 프로그래밍_기초;

import java.util.Scanner;

public class 배열에서_원소의_특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int k=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(arr[i]%3==0) {
				k=i;
				break;
			}
		}
		System.out.println(arr[k-1]);
	}

}
