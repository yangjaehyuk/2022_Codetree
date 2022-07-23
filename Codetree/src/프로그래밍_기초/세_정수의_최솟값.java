package 프로그래밍_기초;

import java.util.Arrays;
import java.util.Scanner;

public class 세_정수의_최솟값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int[] arr=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
