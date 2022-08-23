package 프로그래밍_연습;

import java.util.Scanner;
public class 요일_맞추기 {
	public static int s(int m, int d) {
		int[] days=new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int total=0;
		for(int i=1;i<m;i++) {
			total+=days[i];
		}
		total+=d;
		return total;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m1=sc.nextInt();
		int d1=sc.nextInt();
		int m2=sc.nextInt();
		int d2=sc.nextInt();
		int diff=s(m2,d2)-s(m1,d1);
		while(diff<0) {
			diff+=7;
		}
		String[] week=new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		System.out.println(week[diff%7]);
	}

}
