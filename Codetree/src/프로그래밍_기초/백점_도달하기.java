package 프로그래밍_기초;

import java.util.Scanner;

public class 백점_도달하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i<=100;i++) {
			if(i>=90) {
				System.out.print("A"+" ");
			}
			else if(i>=80) {
				System.out.print("B"+" ");
			}
			else if(i>=70) {
				System.out.print("C"+" ");
			}
			else if(i>=60) {
				System.out.print("D"+" ");
			}
			else {
				System.out.print("F"+" ");
			}
		}
	}

}
