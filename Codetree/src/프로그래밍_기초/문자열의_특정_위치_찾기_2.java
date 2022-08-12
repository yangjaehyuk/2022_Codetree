package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열의_특정_위치_찾기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[]arr=new String[] {"apple","banana","grape","blueberry","orange"};
		char a=sc.next().charAt(0);
		int cnt=0;
		for(int i=0;i<5;i++) {
			if(arr[i].charAt(2)==a || arr[i].charAt(3)==a) {
				System.out.println(arr[i]);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
