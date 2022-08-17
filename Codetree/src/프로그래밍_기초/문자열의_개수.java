package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열의_개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		String[] arr=new String[201];
		while(true) {
			String s=sc.next();
			if(s.equals("0")) {
				System.out.println(cnt);
				break;
			}
			else {
				
				arr[cnt]=s;
				cnt++;
			}
		}
		for(int i=0;i<cnt;i+=2) {
			System.out.println(arr[i]);
		}
	}

}
