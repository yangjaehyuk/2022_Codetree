package 프로그래밍_기초;

import java.util.Scanner;

public class 평균점수_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] arr=new double[8];
		double sum=0;
		for(int i=0;i<8;i++) {
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.printf("%.1f",sum/8);
	}

}
