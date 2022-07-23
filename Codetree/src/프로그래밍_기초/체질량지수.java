package 프로그래밍_기초;

import java.util.Scanner;

public class 체질량지수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height, weight;
		height=sc.nextInt();
		weight=sc.nextInt();
		int m_weight=weight*10000;
		int body_mass=m_weight/(height*height);
		System.out.println(body_mass);
		if(body_mass>=25) {
			System.out.println("Obesity");
		}
	}

}