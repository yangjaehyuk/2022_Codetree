package 프로그래밍_기초;

import java.util.Scanner;

public class 장학금 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m_score,f_score;
		m_score=sc.nextInt();
		f_score=sc.nextInt();
		if(m_score>=90) {
			if(f_score>=95) {
				System.out.println("100000");
			}
			else if(f_score>=90) {
				System.out.println("50000");
			}
			else {
				System.out.println("0");
			}
		}
		else {
			System.out.println("0");
		}
	}

}
