package 프로그래밍_기초;

import java.util.Scanner;

public class 남녀노소_구분짓기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sex=sc.nextInt();
		int age=sc.nextInt();
		if(sex==0) {
			if(age>=19) {
				System.out.println("MAN");
			}
			else {
				System.out.println("BOY");
			}
		}
		else {
			if(age>=19) {
				System.out.println("WOMAN");
			}
			else {
				System.out.println("GIRL");
			}
		}
	}

}
