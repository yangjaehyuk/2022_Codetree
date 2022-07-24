package 프로그래밍_기초;

import java.util.Scanner;

public class 청소당번_정하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt_c=0;
		int cnt_h=0;
		int cnt_r=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				cnt_c++;
				if(i%3==0 || i%12==0) {
					cnt_c--;
				}
			}
			if(i%3==0) {
				cnt_h++;
				if(i%12==0) {
					cnt_h--;
				}
			}
			if(i%12==0) {
				cnt_r++;
			}
		}
		System.out.printf("%d %d %d",cnt_c,cnt_h,cnt_r);
	}

}
