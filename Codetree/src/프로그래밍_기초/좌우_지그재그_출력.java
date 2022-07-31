package 프로그래밍_기초;

import java.util.Scanner;

public class 좌우_지그재그_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		int l=k;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				k=l;
				for(int j=k;j<=l+n-1;j++) {
					System.out.print(j+" ");
					k++;
				}
			}
			else {
				l=k;
				for(int j=l+n-1;j>=k;j--) {
					System.out.print(j+" ");
					l++;
				}
			}
			System.out.println();
		}
	}

}
