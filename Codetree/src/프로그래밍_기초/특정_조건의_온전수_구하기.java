package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_조건의_온전수_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				continue;
			}
			if(i%10==5) {
				continue;
			}
			if(i%3==0 && i%9!=0) {
				continue;
				
			}
			System.out.print(i+" ");
		}
	}

}
