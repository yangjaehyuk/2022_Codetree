package 프로그래밍_기초;

import java.util.Scanner;

public class 학점_계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double [] arr=new double[n];
		double sum=0;
		int cnt=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			cnt++;
		}
		double rst=sum/cnt;
		System.out.printf("%.1f\n",rst);
		if(rst>=4.0) {
			System.out.println("Perfect");
		}
		else if(rst>=3.0) {
			System.out.println("Good");
		}
		else {
			System.out.println("Poor");
		}
	}

}
