package 프로그래밍_연습;

import java.util.Scanner;

public class _2021년_날짜의_유무 {
	public static boolean s(int m, int d) {
		if(m==2) {
			if(d>=1 && d<=28)
				return true;
			else
				return false;
		}
		else if(m==1 ||m==3 ||m==5 ||m==7 ||m==8 ||m==10 || m==12) {
			if(d>=1 && d<=31)
				return true;
			else
				return false;
		}
		else {
			if(m<13) {
				if(d>=1 && d<=30)
					return true;
				else
					return false;
			}
			else
				return false;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int d=sc.nextInt();
		if(s(m,d))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
