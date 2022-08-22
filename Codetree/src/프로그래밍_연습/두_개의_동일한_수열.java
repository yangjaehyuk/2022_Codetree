package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class 두_개의_동일한_수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			arr2[j]=sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<n;i++) {
			if(arr1[i]==arr2[i])
				cnt++;
			else
				break;
		}
		
		if(cnt==arr1.length)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
