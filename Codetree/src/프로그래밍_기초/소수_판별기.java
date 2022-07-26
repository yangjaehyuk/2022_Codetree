package 프로그래밍_기초;

import java.util.Scanner;

public class 소수_판별기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println("P");
		}
		else {
			System.out.println("C");
		}
	}

}
