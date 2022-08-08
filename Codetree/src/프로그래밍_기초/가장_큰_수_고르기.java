package 프로그래밍_기초;

import java.util.Scanner;

public class 가장_큰_수_고르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[11];
		int max=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>max)
				max=arr[j];
		}
		System.out.println(max);
	}

}
