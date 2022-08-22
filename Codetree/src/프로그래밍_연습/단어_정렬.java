package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class 단어_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] c=new String[n];
		for(int i=0;i<n;i++) {
			c[i]=sc.next();
		}
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
