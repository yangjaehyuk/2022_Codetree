package 프로그래밍_기초;

import java.util.Scanner;

public class 일까지_나누기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			int n_n=n/i;
			n=n_n;
			if(n_n>1) {
				cnt++;
			}
			else {
				break;
			}
			
		}
		System.out.println(cnt+=1);
	}

}
