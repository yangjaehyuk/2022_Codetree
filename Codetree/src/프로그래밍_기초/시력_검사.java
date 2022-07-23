package 프로그래밍_기초;

import java.util.Scanner;

public class 시력_검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double l_eye=sc.nextDouble();
		double r_eye=sc.nextDouble();
		if(l_eye>=1.0 && r_eye>=1.0) {
			System.out.println("High");
		}
		else if(l_eye>=0.5 && r_eye>=0.5) {
			System.out.println("Middle");
		}
		else {
			System.out.println("Low");
		}
		
	}

}
