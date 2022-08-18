package 프로그래밍_연습;

import java.util.Scanner;

public class 함수를_이용한_연속부분수열_여부_판단하기 {
	public static int n1,n2;
	public static int[] arr1=new int[100];
	public static int[] arr2=new int[100];
	public static boolean s(int n) {
		for(int i=0;i<n2;i++) {
			if(arr1[i+n]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean j() {
		for(int i=0;i<=n1-n2;i++) {
			if(s(i))
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		if(j())
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
