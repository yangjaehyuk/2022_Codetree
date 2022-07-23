package 프로그래밍_기초;

import java.util.Scanner;

public class 숫자의_계절은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int season=sc.nextInt();
		if(season>2 && season<6) {
			System.out.println("Spring");
		}
		if(season>5 && season<9) {
			System.out.println("Summer");
		}
		if(season>8 && season<12) {
			System.out.println("Fall");
		}
		if(season>11 || season<3) {
			System.out.println("Winter");
		}
	}

}
