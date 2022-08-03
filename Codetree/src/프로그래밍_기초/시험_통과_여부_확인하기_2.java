package 프로그래밍_기초;

import java.util.Scanner;

public class 시험_통과_여부_확인하기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int[] arr=new int[4];
			int sum=0;
			
		
			for(int j=0;j<4;j++) {
				arr[j]=sc.nextInt();
				
				sum+=arr[j];
			}
			if((double)sum/4>=60) {
				System.out.println("pass");
				cnt++;
			
			}
			else {
				System.out.println("fail");
			}
			
		}
		System.out.println(cnt);
	}
}