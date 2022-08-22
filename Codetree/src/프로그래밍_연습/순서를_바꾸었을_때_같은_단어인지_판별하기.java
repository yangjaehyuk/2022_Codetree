package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class 순서를_바꾸었을_때_같은_단어인지_판별하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if(a.length()!=b.length())
			System.out.println("No");
		else {
			char[] c1=a.toCharArray();
			Arrays.sort(c1);
			char[] c2=b.toCharArray();
			Arrays.sort(c2);
			for(int i=0;i<a.length();i++) {
				if(c1[i]!=c2[i]) {
					System.out.println("No");
					System.exit(0);;
				}
			}
			System.out.println("Yes");
		}
	}

}
