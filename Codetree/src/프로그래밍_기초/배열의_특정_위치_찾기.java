package 프로그래밍_기초;

import java.util.Scanner;

public class 배열의_특정_위치_찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int sum=0;
		int sum_3=0;
		int cnt=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
            if((i + 1) % 2 == 0)
                sum += arr[i];
            if((i + 1) % 3 == 0) {
                sum_3 += arr[i];
                cnt++;
            }
        }
		System.out.printf("%d %.1f",sum,(double)sum_3/cnt);
	}

}
