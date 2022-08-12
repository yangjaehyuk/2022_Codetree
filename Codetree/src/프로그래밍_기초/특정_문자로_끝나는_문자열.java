package 프로그래밍_기초;

import java.util.Scanner;

public class 특정_문자로_끝나는_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr=new String[10];
		int cnt=0;
		for(int i=0;i<10;i++) {
			arr[i]=sc.next();
		}
		char a=sc.next().charAt(0);
		for(int i=0;i<10;i++) {
			if(arr[i].charAt(arr[i].length()-1)==a){
				System.out.println(arr[i]);
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("None");
		}
	}

}
