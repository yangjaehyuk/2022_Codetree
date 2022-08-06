package 프로그래밍_기초;

import java.util.Scanner;

public class 코로나_매뉴얼_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int acount=0;
		int bcount=0;
		int ccount=0;
		int dcount=0;
		int ecount=0;
		char a_1=sc.next().charAt(0);
		int n_1=sc.nextInt();
		char a_2=sc.next().charAt(0);
		int n_2=sc.nextInt();
		char a_3=sc.next().charAt(0);
		int n_3=sc.nextInt();
		if(a_1=='Y' && n_1>=37) {
			acount++;
			ecount++;
		}
		if(a_1=='N' && n_1>=37) {
			bcount++;
		}
		if(a_1=='Y' && n_1<37) {
			ccount++;
		}
		if(a_1=='N' && n_1<37) {
			dcount++;
		}
		if(a_2=='Y' && n_2>=37) {
			acount++;
			ecount++;
		}
		if(a_2=='N' && n_2>=37) {
			bcount++;
		}
		if(a_2=='Y' && n_2<37) {
			ccount++;
		}
		if(a_2=='N' && n_2<37) {
			dcount++;
		}
		if(a_3=='Y' && n_3>=37) {
			acount++;
			ecount++;
		}
		if(a_3=='N' && n_3>=37) {
			bcount++;
		}
		if(a_3=='Y' && n_3<37) {
			ccount++;
		}
		if(a_3=='N' && n_3<37) {
			dcount++;
		}
		System.out.print(acount+" "+bcount+" "+ccount+" "+dcount+" ");
		if(ecount>=2)
			System.out.print("E");
		
	}

}
