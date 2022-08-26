package 프로그래밍_연습;

import java.util.Scanner;

public class 벌금은_누구에게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[10001];
		int[] t=new int[101];
		int ans=-1;
		for(int i=0;i<m;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<m;i++) {
			int target=arr[i];
			t[target]++;
			if(t[target]>=k) {
				ans=target;
				break;
			}
		}
		System.out.println(ans);
	}
}

