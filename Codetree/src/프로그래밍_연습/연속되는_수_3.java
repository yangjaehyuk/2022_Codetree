package 프로그래밍_연습;

import java.util.Scanner;

public class 연속되는_수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt1 = 0,cnt2 = 0,ans=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt()+1000;
		}
		for(int i=0;i<n;i++) {
			if(i>0 && (arr[i]<1000 && arr[i-1]<1000)){
				cnt1++;	
			}
			else
				cnt1=1;
			if(i>0 && (arr[i]>1000 && arr[i-1]>1000)) {
				cnt2++;	
			}
			else
				cnt2=1;
			if(cnt1>cnt2) {
				ans=Math.max(ans, cnt1);
			}
			else
				ans=Math.max(ans,cnt2);
		}
		System.out.println(ans);
	}

}
