package 프로그래밍_연습;

import java.util.Scanner;

public class Date_to_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m1=sc.nextInt();
		int d1=sc.nextInt();
		int m2=sc.nextInt();
		int d2=sc.nextInt();
		int day=0;
		while(true) {
			if(m1==m2 && d1==d2)
				break;
			d1++;
			day++;
			if(m1==1 || m1==3 ||m1==5 ||m1==7 ||m1==8 ||m1==10 ||m1==12) {
				if(d1==31) {
					d1=0;
					m1++;
				}
			}
			else if(m1==4||m1==6||m1==9||m1==11) {
				if(d1==30) {
					d1=0;
					m1++;
				}
			}
			else {
				if(d1==28) {
					d1=0;
					m1++;
				}
			}
		}
		System.out.println(day+1);
	}

}
