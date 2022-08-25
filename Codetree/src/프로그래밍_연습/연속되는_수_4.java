package 프로그래밍_연습;

import java.util.Scanner;

public class 연속되는_수_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int cnt=0;
		int ans=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i>0 && (arr[i]>arr[i-1])) {
				cnt++;
			}
			else
				cnt=1;
			ans=Math.max(ans, cnt);
		}
		System.out.println(ans);
	}

}
