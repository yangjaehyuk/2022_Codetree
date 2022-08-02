package 프로그래밍_기초;

import java.util.Scanner;

public class 약수의_개수가_3개인_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int rst=0;
		for(int i=start;i<=end;i++) {
			int cnt=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					cnt++;
			}
			if(cnt==3)
				rst++;
		}
		System.out.println(rst);
	}
	

}
