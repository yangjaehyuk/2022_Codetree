package 프로그래밍_기초;

import java.util.Scanner;

public class 배열_채우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int cnt=0;
		int [] arr=new int[10];
		for(int i=0;i<10;i++) {
			n=sc.nextInt();
			if(n==0) {
				break;
			}
			else {
				arr[i]=n;
				cnt++;
			}
		}
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
