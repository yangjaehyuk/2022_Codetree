package 프로그래밍_기초;

import java.util.Scanner;

public class 두_사람 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s_score=0;
		int f_score=0;
		int f_age;
		String f_sex;
		f_age=sc.nextInt();
		f_sex=sc.next();
		int s_age;
		String s_sex;
		s_age=sc.nextInt();
		s_sex=sc.next();
		if(s_sex.equals("M")) {
			s_score+=1;
		}
		else {
			s_score+=0;
		}
		if(f_sex.equals("M")) {
			f_score+=1;
		}
		else {
			f_score+=0;
		}
		if(f_age>=19) {
			f_score+=1;
		}
		else {
			f_score+=0;
		}
		if(s_age>=19) {
			s_score+=1;
		}
		else {
			s_score+=0;
		}
		if(f_score==2 || s_score==2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}

}
