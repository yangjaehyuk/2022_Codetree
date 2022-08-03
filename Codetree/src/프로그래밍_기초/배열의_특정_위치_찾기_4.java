package 프로그래밍_기초;

import java.util.Scanner;

public class 배열의_특정_위치_찾기_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int[] arr=new int[10];
		int cnt=0;
		int sum=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0)
				break;
			if(arr[i]%2==0) {
				sum+=arr[i];
				cnt++;
			}
		}
		System.out.print(cnt+" ");
		System.out.println(sum);
	}

}
