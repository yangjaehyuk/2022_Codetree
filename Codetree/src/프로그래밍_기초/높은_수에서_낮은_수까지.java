package 프로그래밍_기초;

import java.util.Scanner;

public class 높은_수에서_낮은_수까지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(b>a) {
			for(int i=b;i>=a;i--) {
				System.out.print(i+" ");
			}
		}
		else {
			for(int i=a;i>=b;i--) {
				System.out.print(i+" ");
			}
		}
	}

}
