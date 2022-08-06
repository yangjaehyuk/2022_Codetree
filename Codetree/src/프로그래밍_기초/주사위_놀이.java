package 프로그래밍_기초;

import java.util.Scanner;

public class 주사위_놀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int[] count=new int[7];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			count[arr[i]]++;
		}
		for(int i=1;i<=6;i++) {
			System.out.println(i+" - "+count[i]);
		}
	}

}
