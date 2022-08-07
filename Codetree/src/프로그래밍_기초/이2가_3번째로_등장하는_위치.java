package 프로그래밍_기초;

import java.util.Scanner;

public class 이2가_3번째로_등장하는_위치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		int cnt=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]==2) {
				cnt++;
			}
			if(cnt==3) {
				System.out.println(j+1);
				System.exit(0);
			}
		}
	}

}
