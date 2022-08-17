package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_거꾸로_출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s=sc.next();
			if(s.equals("END")) {
				break;
			}
			else {
				int i=s.length()-1;
				for(int j=i;j>=0;j--) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
