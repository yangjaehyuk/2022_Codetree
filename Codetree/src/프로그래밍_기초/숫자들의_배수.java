package 프로그래밍_기초;

import java.util.Scanner;

public class 숫자들의_배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=n*(i+1);
			System.out.print(arr[i]+" ");
			if(n*(i+1)%5==0)
				cnt++;
			if(cnt==2) {
				break;
			}
			
		}
	}

}
